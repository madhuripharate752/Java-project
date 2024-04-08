package encapsulation;

public class ExampleEncapsulation {
    class Account {
        private long accno;
        private String name;
        private String email;
        private float amount;
        //public getter and setter methods
        public long getAccno() {
            return accno;
        }
        public void setAccno(long accno) {
            this.accno = accno;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public float getAmount() {
            return amount;
        }
        public void setAmount(float amount) {
            this.amount = amount;
        }

    }
    public class TestEncapsulation {
        public void main(String[] args) {
            //creating instance of Account class
            Account acc=new Account();
            //setting values through setter methods
            acc.setAccno(7560504000L);
            acc.setName("Sonoo Jaiswal");
            acc.setEmail("sonoojaiswal@javatpoint.com");
            acc.setAmount(500000f);
            //getting values through getter methods
            System.out.println(acc.getAccno()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
        }
    }
}
