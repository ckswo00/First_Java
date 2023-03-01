package chap_05;

public class _06_ASCII2 {
    public static void main(String[] args) {
        // 세로 크기 10 x 가로 크기 15 에 해당하는 영화관 좌석
        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) { // 세로
            for (int j = 0; j < seats3[i].length; j++) { // 가로
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }
        // 영화관 좌석 번호 확인
        for (int i = 0; i < seats3.length; i++) { // 세로
            for (int j = 0; j < seats3[i].length; j++) { // 가로
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
