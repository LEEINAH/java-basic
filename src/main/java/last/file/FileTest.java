package last.file;


public class FileTest {
    public static void main(String[] args) {


        // 자바의 대부분의 정보는 객체라는 형태로 구조화(얼려져)되어 있다.
        // 파일은 기본적으로 텍스트로 저장된다.
        // 자바의 객체를 바로 텍스트로 저장 불가능.
        // 자바의 객체를 먼저 텍스트화(문자화) 시켜야 함. => 직렬화(Serializable)
        // 텍스트를 불러와서 자바의 객체 형태로 만드는 것 => 역직렬화(Deserializable)

        // 객체 직렬화 -> jackson 라이브러리를 이용해 객체를 json 문자화하기

        Post post = new Post(1, "aaa", "bbb", "20240912", 0, 1);

        // 객체를 JSON 문자열로 직렬화
        String jsonString = JsonUill.serializeToJson(post);

        FileUtill.writeFile("post.json", jsonString); // 직렬화된 post를 test.json 파일에 저장

        // 파일에서 JSON 문자열 불러오기
        String jsonString2 = FileUtill.readFile("post.json");

        // JSON 문자열을 Post 객체로 역직렬화
        if (jsonString != null) {
            Post post1 = JsonUill.deserializeFromJson(jsonString2, Post.class);

            // 결과 출력
            if (post1 != null) {
                System.out.printf("제목 : %s\n", post1.getTitle());
                System.out.printf("내용 : %s\n", post1.getBody());
            }
        }

    }
}
