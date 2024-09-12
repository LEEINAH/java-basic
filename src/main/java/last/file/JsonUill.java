package last.file;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class JsonUill {

    // 객체를 JSON 문자열로 직렬화하는 메서드
    public static <T> String serializeToJson(T object) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // 객체를 JSON 문자열로 변환
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // JSON 문자열을 객체로 역직렬화하는 메서드
    public static <T> T deserializeFromJson(String jsonString, Class<T> clazz) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // JSON 문자열을 객체로 변환
            return objectMapper.readValue(jsonString, clazz);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }



}
