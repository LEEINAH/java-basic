package txtBoard.model;

import java.util.ArrayList;

public class MemberRepository {
    private ArrayList<Member> members = new ArrayList<>();

    public void saveMemberInformation(Member member) {
        members.add(member);
    }

    public Member getMemberByLoginId(String id, String password) {
        for (Member member : members) {
            if (member.getId().equals(id)) {
                if (member.getPassword().equals(password)) {
                    return member;
                }
            }
        }
        return null;
    }
}
