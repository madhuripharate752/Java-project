package loopexample;

public class FibancciSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=0;
        int range= 5;
        for(int i=a; i<=range; i++){
            if(c<=range){
                c=a+b;
                System.out.println(c);
                a=b;
                b=c;
            }
        }
    }

}
