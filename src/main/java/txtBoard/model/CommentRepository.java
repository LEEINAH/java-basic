package txtBoard.model;

import java.util.ArrayList;

public class CommentRepository {
    private ArrayList<Comment> comments = new ArrayList<>();

    public void saveComment(Comment comment) {
        comments.add(comment);
    }

    public ArrayList<Comment> getCommentsByPostNum(int postNum) {
        ArrayList<Comment> findCommentList = new ArrayList<>();
        for (Comment comment : comments) {
            if (comment.getPostNum() == postNum) {
                findCommentList.add(comment);
            }
        }
        return findCommentList;
    }
}
