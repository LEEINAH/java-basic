package txtBoard.model;

import java.util.ArrayList;

public class PostRepository {
    private ArrayList<Post> posts = new ArrayList<>();

    public void savePost(Post post) {
        posts.add(post);
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public Post findPostByPostNum(int postNum) {
        for (Post post : posts) {
            if (post.getPostNum() == postNum) {
                return post;
            }
        }
        return null;
    }

    public void deletePost(Post post) {
        posts.remove(post);
    }

    public ArrayList<Post> findPostByKeyword(String keyword) {
        ArrayList<Post> searchPost = new ArrayList<>();
        for (Post post : posts) {
            if (post.getTitle().contains(keyword)) {
                searchPost.add(post);
            }
        }
        return searchPost;
    }

    public void updateMyPost(int postNum, String newTitle, String newBody) {
        Post post = findPostByPostNum(postNum);
        post.setTitle(newTitle);
        post.setBody(newBody);
    }
}
