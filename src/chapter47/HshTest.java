package chapter47;

import javax.swing.*;
import java.util.Objects;

public class HshTest {
//    public static String hashString(String input) {
//        try {
//            // MessageDigest 인스턴스 생성 (해시 알고리즘으로 SHA-256 선택)
//            MessageDigest digest = MessageDigest.getInstance("SHA-256");
//
//            // 입력 문자열을 바이트 배열로 변환하여 해시 함수에 전달
//            byte[] hashBytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));
//
//            // Base64로 인코딩하여 해시된 문자열 반환
//            return Base64.getEncoder().encodeToString(hashBytes);
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }


    public static void main(String[] args) {
        //Data 검색을 위한 Hash
        String password = "q1w2e3r45";
//        String hashPassword = hashString(password);
        long haschCode = Objects.hashCode(password);
        long hashCode2 = Objects.hashCode(2244);
        long hashCode3 = Objects.hashCode(new Customer("짱구"));
        long hashCode4 = Objects.hashCode(new VIPCustomer("짱구엄마"));



        System.out.println(haschCode);
        System.out.println(hashCode2);
        System.out.println(hashCode3);
        System.out.println(hashCode4);



    }



}
