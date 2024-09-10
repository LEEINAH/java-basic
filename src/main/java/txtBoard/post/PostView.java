package txtBoard.post;

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

    public void printPostDetail(Post post) {
        System.out.println("==================");
        System.out.printf("번호 : %d\n", post.getPostNum());
        System.out.printf("제목 : %s\n", post.getTitle());
        System.out.printf("제목 : %s\n", post.getBody());
        System.out.printf("등록날짜 : %s\n", post.getCreatetime());
        System.out.printf("조회수 : %s\n", post.getHit());
        System.out.println("==================");
    }
}
