package txtBoard.view;

import txtBoard.model.Comment;
import txtBoard.model.Post;

import java.util.ArrayList;

public class PostView {

    public void printPostList(ArrayList<Post> posts) {
        System.out.println("==================");
        for (Post post : posts) {
            System.out.printf("번호 : %d\n", post.getPostNum());
            System.out.printf("제목 : %s\n", post.getTitle());
            System.out.println("==================");
        }
    }

    public void printPostDetail(Post post, ArrayList<Comment> comments) {
        System.out.println("===== 1번 게시물 =====");
        System.out.printf("번호 : %d\n", post.getPostNum());
        System.out.printf("제목 : %s\n", post.getTitle());
        System.out.printf("내용 : %s\n", post.getBody());
        System.out.printf("등록 날짜 : %s\n", post.getCreateTiem());
        System.out.printf("조회수 : %d\n", post.getHit());
        System.out.println("======================");
        printPostComment(comments);
    }

    public void printPostComment(ArrayList<Comment> comments) {
        if (!comments.isEmpty()) {
            System.out.println("======= 댓글 =======");
            for (Comment comment : comments) {
                System.out.printf("댓글 내용 : %s\n", comment.getCommentBody());
                System.out.printf("댓글 작성일 : %s\n", comment.getCreateTiem());
                System.out.println("====================");
            }
        }
    }
}
