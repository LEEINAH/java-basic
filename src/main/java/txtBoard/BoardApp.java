package txtBoard;

import txtBoard.post.PostControler;
import txtBoard.post.PostRepository;

import java.util.Scanner;

public class BoardApp {

    private PostControler postControler = new PostControler();
    Scanner sc = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.print("명령어를 입력하세요 : ");
            String menu = sc.nextLine();

            if (menu.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (menu.equals("add")) {
                postControler.add();
            } else if (menu.equals("list")) {
                postControler.list();
            } else if (menu.equals("update")) {
                postControler.update();
            } else if (menu.equals("delete")) {
                postControler.delete();
            } else if (menu.equals("detail")) {
                postControler.detail();
            } else if (menu.equals("search")) {
                postControler.search();
            }















        }
    }
}
