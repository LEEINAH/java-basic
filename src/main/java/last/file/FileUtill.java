package last.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileUtill {

    // 파일에 문자열을 저장하는 메서드
    public static void writeFile(String fileName, String content) {
        try {
            Files.write(Paths.get(fileName), content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("파일 저장 실패 : " + fileName);
        }
    }

    // 파일에서 문자열을 불러오는 메서드
    public static String readFile(String fileName) {
        try {
            // 파일의 내용을 읽어 문자열로 반환
            return new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("파일 읽기 실패 : " + fileName);
            return null;
        }
    }
}
