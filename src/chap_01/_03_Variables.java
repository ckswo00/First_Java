package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "?��?��코딩";
        int hour = 15;


        System.out.println(name + "?��, 배송?�� ?��?��?��?��?��. " + hour + "?��?�� 방문 ?��?��?��?��?��.");
        System.out.println(name + "?��, 배송?�� ?��료되?��?��?��?��.");


        double score = 90.5;
        char grade = 'A';
        name = "강백?��";
        System.out.println(name + "?��?�� ?���? ?��?��?�� " + score + "?��?��?��?��.");
        System.out.println("?��?��??? " + grade + "?��?��?��.");


        boolean pass = true;
        System.out.println("?���? ?��?��?�� ?��격했?��까요? " + pass);


        double d = 3.14123456789; //?���??�� ?��?��?��??? double
        float f = 3.14123456789F; //float??? ?��?��?�� ?��?�� F?��f�? 붙여?�� float?��?���? ?��?��줘야?��, ?��?��?�� ?���? ?��?��?�� ?��?��?��.
        System.out.println(d);
        System.out.println(f);


        long l = 1000000000000L;   //?��?��?��??? 21?��까�??밖에 ?��?��, 그래?�� long?�� ?��?��?��?��?��
        l = 1_000_000_000_000L;
        System.out.println(l);


        // int, long, float, double, char, string, boolean
    }
}
