package chap_05;

public class _05_ASCII1 {
    public static void main(String[] args) {
        // 아스키 코드 (ANSI) : 미국 표준 코드

        // 알파벳 대문자(A)는 65 부터 시작, 소문자(a)는 97 부터 시작, 숫자(0)은 48부터 시작.
        System.out.println("------대문자------");
        char c = 'A';
        System.out.println(c);
        System.out.println((int)c);

        c = 'B';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        System.out.println("------소문자------");
        
        c = 'a';
        System.out.println(c);
        System.out.println((int)c);

        c = 'b';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        System.out.println("------숫자------");
        
        c = '0';
        System.out.println(c);
        System.out.println((int)c);

        c = '1';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);
    }
}
