package chap_01;
/*
(실행결과)
상암08번 버스
약 3분 후 도착
남은 거리 1.2km
*/

public class _Quiz_01 {
    public static void main(String[] args) {

        // 내 맘가는대로 만듬
        String busNo = "1234";
        int time = 3;
        double distance = 0.8;
        System.out.println(busNo + "번 버스\n약 " + time + "분 후 도착\n남은 거리 " + distance + "km");

        // 3줄로
        System.out.println(busNo + "번 버스");
        System.out.println("약 " + time + "분 후 도착");
        System.out.println("남은 거리 " + distance + "km");

        // 정답
        // 버스 번호 (1234, 상암08)
        busNo = "상암08";

        // 남은 시간 (3분, 5분)
        int minute = 3;

        // 남은 거리 (1.5km, 0.8km)
        distance = 1.2;

        // 결과 출력
        System.out.println(busNo + "번 버스");
        System.out.println("약 " + minute + "분 후 도착");
        System.out.println("남은 거리 " + distance + "km");
    }
}
