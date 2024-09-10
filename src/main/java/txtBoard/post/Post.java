package txtBoard.post;

public class Post {
    private int postNum;
    private String title;
    private String body;
    private String createtime;
    private int hit;

    public Post(int postNum, String title, String body, String createtime, int hit) {
        this.postNum = postNum;
        this.title = title;
        this.body = body;
        this.createtime = createtime;
        this.hit = hit;
    }

    public void views() {
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

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }
}
