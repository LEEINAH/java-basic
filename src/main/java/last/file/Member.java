package last.file;

public class Member {

    private int memberNum;
    private String id;
    private String password;
    private String nickname;

    public Member() {}

    public Member(int memberNum, String id, String password, String nickname) {
        this.memberNum = memberNum;
        this.id = id;
        this.password = password;
        this.nickname = nickname;
    }

    public void increase() {
        this.memberNum++;
    }

    public int getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(int memberNum) {
        this.memberNum = memberNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
