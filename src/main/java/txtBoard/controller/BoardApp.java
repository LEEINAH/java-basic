package txtBoard.controller;

import txtBoard.model.Member;
import txtBoard.model.Post;
import txtBoard.model.PostRepository;

import java.util.Scanner;

public class BoardApp {

    private PostController postController = new PostController();
    private MemberController memberController = new MemberController();
    private Scanner sc = new Scanner(System.in);

    public void start() {
        while (true) {
            Member loginMember = memberController.getLoginMember();
            if (loginMember == null) {
                System.out.print("명령어를 입력하세요 : ");
            } else {
                System.out.printf("명령어를 입력하세요[%s(%s)] : ", loginMember.getId(), loginMember.getNickname());
            }
            String menu = sc.nextLine();

            if (menu.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (menu.equals("add")) {
                postController.add(loginMember);
            } else if (menu.equals("list")) {
                postController.list();
            } else if (menu.equals("update")) {
                postController.update();
            } else if (menu.equals("delete")) {
                postController.delete();
            } else if (menu.equals("detail")) {
                postController.detail();
            } else if (menu.equals("search")) {
                postController.search();
            } else if (menu.equals("signup")) {
                memberController.signup();
            } else if (menu.equals("login")) {
                memberController.login();
            }




        }

    }
}
