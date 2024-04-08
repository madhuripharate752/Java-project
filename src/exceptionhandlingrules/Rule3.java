package exceptionhandlingrules;

class Rule14{
    public static void main(String[] args) {
        String name = null;
        try {
            System.exit(0);
            System.out.println(10 / 10);
    }finally {
            System.out.println("finally block ");
        }
    }
}