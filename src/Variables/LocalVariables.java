package Variables;

public class LocalVariables {
    public void normalmethod() {
        int a = 100;
        System.out.println("Value of A=" + a);
    }

    public static void main(String[] args) {
        LocalVariables lv = new LocalVariables();
        lv.normalmethod();

    }
    }

