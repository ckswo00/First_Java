package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String id1 = "901231-1234567"; // 주민등록번호 13자리
        String id2 = "030708-4567890"; // 주민등록번호 13자리
        System.out.println(id1.substring(0,8)); // 0 위치부터 8 위치 직전까지
        System.out.println(id2.substring(0,id2.indexOf("-") + 2)); // 0 위치부터 하이픈 위치 + 2 직전까지
    }
}
