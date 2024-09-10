package txtBoard.post;

import java.util.ArrayList;

public class PostRepository {

    private ArrayList<Post> posts = new ArrayList<>();

    public void save(Post post) {
        posts.add(post);
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public Post findPostByNum(int targetNum) {
        for (Post post : posts) {
            if (post.getPostNum() == targetNum) {
                return post;
            }
        }
        return null;
    }

    public void postDelete(Post post) {
        posts.remove(post);
    }

    public ArrayList<Post> getPostByKeyword(String keyword) {
        ArrayList<Post> searchedPost = new ArrayList<>();

        for (Post post : posts) {
            if (post.getTitle().contains(keyword)) {
                searchedPost.add(post);
            }
        }
        return searchedPost;
    }
}
