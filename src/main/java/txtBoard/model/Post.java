package txtBoard.model;

public class Post {
    private int postNum;
    private String title;
    private String body;
    private String createTiem;
    private int hit;
    private int memberNum;



    public Post(int postNum, String title, String body, String createTiem, int hit, int memberNum) {
        this.postNum = postNum;
        this.title = title;
        this.body = body;
        this.createTiem = createTiem;
        this.hit = hit;
        this.memberNum = memberNum;
    }

    public int getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(int memberNum) {
        this.memberNum = memberNum;
    }

    public void increase() {
        this.hit++;
    }

    public int getPostNum() {
        return postNum;
    }

    public void setPostNum(int postNum) {
        this.postNum = postNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCreateTiem() {
        return createTiem;
    }

    public void setCreateTiem(String createTiem) {
        this.createTiem = createTiem;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }
}
