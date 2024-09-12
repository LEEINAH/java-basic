package txtBoard.controller;

import txtBoard.model.*;
import txtBoard.view.PostView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PostController {

    private PostRepository postRepository = new PostRepository();
    private PostView postView = new PostView();
    private CommentRepository commentRepository = new CommentRepository();
    private MemberController memberController = new MemberController();
    private MemberRepository memberRepository = new MemberRepository();
    private Scanner sc = new Scanner(System.in);
    private int postNum = 4;

    public PostController() {
        Post post1 = new Post(1, "안녕하세요 반갑습니다. java 공부중이에요.", "넘 어렵네요 ㅜ", getCurrentTiem(), 0, 1);
        Post post2 = new Post(2, "java 질문좀 할게요~", "search 기능 어떻게 만드나요?", getCurrentTiem(), 0, 1);
        Post post3 = new Post(3, "정처기 따야되나요?", "아무래도 따는게 좋겠죠?", getCurrentTiem(), 0, 1);

        Member member = new Member(1, "hong123", "hong123", "홍길동");

        postRepository.savePost(post1);
        postRepository.savePost(post2);
        postRepository.savePost(post3);

        memberRepository.saveMemberInformation(member);
        memberRepository.saveMemberInformation(member);
        memberRepository.saveMemberInformation(member);
    }

    public void add(Member member) {
        Member loginMember = memberController.getLoginMember();

        if (member == null) {
            System.out.println("로그인을 해야 게시물을 작성할 수 있습니다.");
            return;
        }
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.print("게시물 내용을 입력해주세요 : ");
        String body = sc.nextLine();

        Post post = new Post(postNum, title, body, getCurrentTiem(), 0, loginMember.getMemberNum());
        postRepository.savePost(post);
        postNum++;
    }

    public void list() {
        ArrayList<Post> posts = postRepository.getPosts();
        postView.printPostList(posts);
    }

    public void update() {
        System.out.print("수정할 게시물 번호를 입력해주세요 : ");
        int updateNum = getParsedInt(sc.nextLine(), -1);

        if (updateNum == -1) {
            return;
        }

        Post post = postRepository.findPostByPostNum(updateNum);

        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }

        System.out.print("수정할 제목을 입력해주세요 : ");
        String newTitle = sc.nextLine();
        System.out.print("수정할 내용을 입력해주세요 : ");
        String newBody = sc.nextLine();

        post.setTitle(newTitle);
        post.setBody(newBody);

        System.out.printf("%d번 게시물 수정이 완료되었습니다.\n", updateNum);
    }

    public void delete() {
        System.out.print("삭제할 게시물 번호를 입력해주세요 : ");
        int deleteNum = getParsedInt(sc.nextLine(), -1);

        if (deleteNum == -1) {
            return;
        }

        Post post = postRepository.findPostByPostNum(deleteNum);

        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }

        postRepository.deletePost(post);

        System.out.printf("%d번 게시물 삭제가 완료되었습니다.\n", deleteNum);
    }

    public void detail() {
        System.out.print("상세보기할 게시물 번호를 입력해주세요 : ");
        int detailNum = getParsedInt(sc.nextLine(), -1);

        if (detailNum == -1) {
            return;
        }

        Post post = postRepository.findPostByPostNum(detailNum);

        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }
        post.increase();

        ArrayList<Comment> comments = commentRepository.getCommentsByPostNum(detailNum);
        postView.printPostDetail(post, comments);

        while (true) {
            System.out.print("상세보기 기능을 선택해주세요(1. 댓글 등록, 2. 좋아요, 3. 수정, 4. 삭제, 5. 목록으로) : ");
            int detailFunctionNum = Integer.parseInt(sc.nextLine());

            if (detailFunctionNum == 1) {
                System.out.print("댓글 내용 : ");
                String commentBody = sc.nextLine();

                Comment comment = new Comment(1, detailNum, commentBody, getCurrentTiem());

                commentRepository.saveComment(comment);

                comment.increase();

                ArrayList<Comment> comments1 = commentRepository.getCommentsByPostNum(detailNum);
                postView.printPostDetail(post, comments1);

            } else if (detailFunctionNum == 2) {

            } else if (detailFunctionNum == 3) {
                System.out.print("수정할 제목을 입력해주세요 : ");
                String newTitle = sc.nextLine();
                System.out.print("수정할 내용을 입력해주세요 : ");
                String newBody = sc.nextLine();

                postRepository.updateMyPost(detailNum, newTitle, newBody);
                ArrayList<Comment> comments1 = commentRepository.getCommentsByPostNum(detailNum);
                postView.printPostDetail(post, comments1);
            } else if (detailFunctionNum == 4) {

            } else if (detailFunctionNum == 5) {
                System.out.println("상세보기 화면을 빠져나갑니다.");
                break;
            }

        }
    }

    public void search() {
        System.out.print("검색 키워드를 입력해주세요 : ");
        String keyword = sc.nextLine();

        ArrayList<Post> posts = postRepository.findPostByKeyword(keyword);

        if (posts.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
            return;
        }

        postView.printPostList(posts);
    }













    public String getCurrentTiem() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String currentTiem = dateTime.format(formatter);
        return currentTiem;
    }

    public int getParsedInt(String value, int defaultValue) {
        // try - catch를 최대한 사용 안하는게 좋다.
        // 몇가지 상황을 제외하고는 try = catch 사용 안하고 if로 처리 가능함.
        try {
            int parsedInt = Integer.parseInt(value);
            return parsedInt;
        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력해주세요.");
        }
        return defaultValue;
    }
}
