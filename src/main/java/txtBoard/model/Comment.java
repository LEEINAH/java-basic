package txtBoard.model;

public class Comment {
    private int commentNum;
    private int postNum;
    private String commentBody;
    private String createTiem;

    public Comment(int commentNum, int postNum, String commentBody, String createTiem) {
        this.commentNum = commentNum;
        this.postNum = postNum;
        this.commentBody = commentBody;
        this.createTiem = createTiem;
    }

    public void increase() {
        this.commentNum++;
    }

    public int getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }

    public int getPostNum() {
        return postNum;
    }

    public void setPostNum(int postNum) {
        this.postNum = postNum;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public void setCommentBody(String commentBody) {
        this.commentBody = commentBody;
    }

    public String getCreateTiem() {
        return createTiem;
    }

    public void setCreateTiem(String createTiem) {
        this.createTiem = createTiem;
    }
}
