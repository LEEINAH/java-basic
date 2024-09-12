package txtBoard.controller;

import txtBoard.model.Member;
import txtBoard.model.MemberRepository;

import java.util.Scanner;

public class MemberController {

    private MemberRepository memberRepository = new MemberRepository();
    private Scanner sc = new Scanner(System.in);
    private Member loginMember = null;

    public void signup() {
        System.out.println("====== 회원 가입을 진행합니다 ======");

        System.out.print("아이디를 입력해주세요 : ");
        String id = sc.nextLine();
        System.out.print("비밀번호를 입력해주세요 : ");
        String password = sc.nextLine();
        System.out.print("닉네임을 입력해주세요 : ");
        String nickname = sc.nextLine();

        Member member = new Member(1, id, password, nickname);
        memberRepository.saveMemberInformation(member);

        System.out.println("   ");
        System.out.println("==== 회원가입이 완료되었습니다. ====");
        System.out.println("   ");

        member.increase();
    }

    public void login() {
        System.out.print("아이디를 입력해주세요 : ");
        String id = sc.nextLine();
        System.out.print("비밀번호를 입력해주세요 : ");
        String password = sc.nextLine();

        Member member = memberRepository.getMemberByLoginId(id, password);

        if (member == null) {
            System.out.println("비밀번호를 틀렸거나 잘못된 회원정보입니다.");
            return;
        }

        System.out.printf("%s님 환영합니다!\n", member.getNickname());

        loginMember = member;
    }

    public Member getLoginMember() {
        return loginMember;
    }
}
