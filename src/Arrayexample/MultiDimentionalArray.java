package Arrayexample;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        int value[][] = {{10, 10, 10, 10}, {20, 20, 20, 20}, {30, 30, 30, 30}};
        for (int i = 0; i<value.length; i++) {
            for (int j = 0; j <=value.length; j++) {
                System.out.print(value[i][j] + " ");
            }
            System.out.println();
        }
    }
}