package Arrayexample;

public class MultidimentionalArrayExample {
    public static void main(String[] args) {
        int [][] a = new int [3][4];
        a[0][0] = 1000;
        a[0][1] =2000;
        a[0][2] = 3000;
        a[0][3] =4000;
        a[1][0] =5000;
        a[1][1] = 6000;
        a[1][2] = 7000;
        a[1][3] = 8000;
        a[2][0] = 9000;
        a[2][1] = 10000;
        a[2][2] =11000;
        a[2][3] = 12000;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<=a.length; j++)
            System.out.println(a[i][j]);
        }
    }
}
