package txtBoard.post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PostControler {

    private PostRepository postRepository = new PostRepository();
    private PostView postView = new PostView();
    Scanner sc = new Scanner(System.in);
    private int postNum = 4;

    public PostControler() {
        Post post1 = new Post(1, "안녕하세요 반갑습니다. java 공부중이에요.", "넘 어렵네요 ㅜ", getCurrentTiem(), 0);
        Post post2 = new Post(2, "java 질문좀 할게요~", "search 기능 어떻게 만드나요?", getCurrentTiem(), 0);
        Post post3 = new Post(3, "정처기 따야되나요?", "아무래도 따는게 좋겠죠?", getCurrentTiem(), 0);

        postRepository.save(post1);
        postRepository.save(post2);
        postRepository.save(post3);
    }

    public void add() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.print("게시물 내용을 입력해주세요 : ");
        String body = sc.nextLine();

        Post post = new Post(postNum, title, body, getCurrentTiem(), 0);
        postRepository.save(post);

        System.out.println("게시물이 저장되었습니다.");

        postNum++;
    }

    public void list() {
        ArrayList<Post> posts = postRepository.getPosts();
        postView.printPostList(posts);
    }

    public void update() {
        System.out.print("수정할 게시물 번호를 입력하세요 : ");
        int updateNum = Integer.parseInt(sc.nextLine());

        Post post = postRepository.findPostByNum(updateNum);

        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }

        System.out.print("수정할 제목을 입력하세요 : ");
        String newTitle = sc.nextLine();
        System.out.print("수정할 내용을 입력하세요 : ");
        String newBody = sc.nextLine();

        post.setTitle(newTitle);
        post.setBody(newBody);

        System.out.printf("%d번 게시물이 수정되었습니다.", updateNum);
    }

    public void delete() {
        System.out.print("삭제할 게시물 번호를 입력하세요 : ");
        int deleteNum = Integer.parseInt(sc.nextLine());

        Post post = postRepository.findPostByNum(deleteNum);

        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }

        postRepository.postDelete(post);

        System.out.printf("%d번 게시물이 삭제되었습니다.", deleteNum);
    }`

    public void detail() {
        System.out.print("상세보기 할 게시물 번호를 입력하세요 : ");
        int detailNum = Integer.parseInt(sc.nextLine());

        Post post = postRepository.findPostByNum(detailNum);

        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }
        post.views();

        postView.printPostDetail(post);
    }

    public void search() {
        System.out.print("검색 키워드를 입력하세요 : ");
        String keyword = sc.nextLine();

        ArrayList<Post> searchedPost = postRepository.getPostByKeyword(keyword);

        if (searchedPost.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
            return;
        }

        postView.printPostList(searchedPost);
    }

    public String getCurrentTiem() {

        // 현재 날짜 구하기
        LocalDateTime dateTime = LocalDateTime.now();
        // 포맷 지정하기
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        // 포맷 사용하여 출력하기
        String formattedDateTiem = dateTime.format(formatter);

        return formattedDateTiem;
    }

}
