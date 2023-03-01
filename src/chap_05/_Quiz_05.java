package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] size = new int[10];
        int j = 5;
        for (int i = 0; i < size.length; i++) {
            size[i] = 245 + j;
            j = j + 5;
        }
        for (int i = 0; i < size.length; i++) {
            System.out.println("사이즈 " + size[i] + " (재고 있음)");
        }

        System.out.println("--------------------------");

        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }
        for (int s : sizeArray) {
            System.out.println("사이즈 " + s + " (재고 있음)");
        }
    }
}
