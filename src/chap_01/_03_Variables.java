package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "?‚˜?„ì½”ë”©";
        int hour = 15;


        System.out.println(name + "?‹˜, ë°°ì†¡?´ ?‹œ?‘?©?‹ˆ?‹¤. " + hour + "?‹œ?— ë°©ë¬¸ ?˜ˆ? •?…?‹ˆ?‹¤.");
        System.out.println(name + "?‹˜, ë°°ì†¡?´ ?™„ë£Œë˜?—ˆ?Šµ?‹ˆ?‹¤.");


        double score = 90.5;
        char grade = 'A';
        name = "ê°•ë°±?˜¸";
        System.out.println(name + "?‹˜?˜ ?‰ê·? ? ?ˆ˜?Š” " + score + "? ?…?‹ˆ?‹¤.");
        System.out.println("?•™? ??? " + grade + "?…?‹ˆ?‹¤.");


        boolean pass = true;
        System.out.println("?´ë²? ?‹œ?—˜?— ?•©ê²©í–ˆ?„ê¹Œìš”? " + pass);


        double d = 3.14123456789; //? •ë°??•œ ?†Œ?ˆ˜? ??? double
        float f = 3.14123456789F; //float??? ?‹¤?ˆ˜?˜• ?’¤?— F?‚˜fë¥? ë¶™ì—¬?„œ float?˜•?¸ì§? ? •?•´ì¤˜ì•¼?•¨, ?†Œ?ˆ˜?  ?’¤ê°? ? •?™•?ˆ ?•ˆ?‚˜?˜´.
        System.out.println(d);
        System.out.println(f);


        long l = 1000000000000L;   //? •?ˆ˜?˜•??? 21?–µê¹Œì??ë°–ì— ?•ˆ?¨, ê·¸ë˜?„œ long?„ ?‚¬?š©?•´?•¼?•¨
        l = 1_000_000_000_000L;
        System.out.println(l);


        // int, long, float, double, char, string, boolean
    }
}
