package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "??μ½λ©";
        int hour = 15;


        System.out.println(name + "?, λ°°μ‘?΄ ???©??€. " + hour + "?? λ°©λ¬Έ ?? ???€.");
        System.out.println(name + "?, λ°°μ‘?΄ ?λ£λ??΅??€.");


        double score = 90.5;
        char grade = 'A';
        name = "κ°λ°±?Έ";
        System.out.println(name + "?? ?κ·? ? ?? " + score + "? ???€.");
        System.out.println("?? ??? " + grade + "???€.");


        boolean pass = true;
        System.out.println("?΄λ²? ??? ?©κ²©ν?κΉμ? " + pass);


        double d = 3.14123456789; //? λ°?? ??? ??? double
        float f = 3.14123456789F; //float??? ?€?? ?€? F?fλ₯? λΆμ¬? float??Έμ§? ? ?΄μ€μΌ?¨, ???  ?€κ°? ? ?? ???΄.
        System.out.println(d);
        System.out.println(f);


        long l = 1000000000000L;   //? ????? 21?΅κΉμ??λ°μ ??¨, κ·Έλ? long? ?¬?©?΄?Ό?¨
        l = 1_000_000_000_000L;
        System.out.println(l);


        // int, long, float, double, char, string, boolean
    }
}
