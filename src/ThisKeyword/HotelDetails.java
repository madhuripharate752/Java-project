package ThisKeyword;

public class HotelDetails {
    int no;
    int prize;
    String food;
    HotelDetails( int no,int prize, String food) {
        this.no = no;
        this.prize = prize;
        this.food = food;
    }
    void foodstall(){
        System.out.println( no +": " +  "Food Prize: "+  prize + " " + "Food Name: "+ food );

    }

    public static void main(String[] args) {
        HotelDetails HD = new HotelDetails(1,500, "noodles");
        HotelDetails HD1 = new HotelDetails(2, 900, "sandwich");
        HotelDetails HD2= new HotelDetails(2, 840, "pizza");
        HotelDetails HD3 = new HotelDetails(2, 700, "burger");
        HotelDetails HD4 = new HotelDetails(2, 200, "coldcoffee");

        HD.foodstall();
        HD1.foodstall();
        HD2.foodstall();
        HD3.foodstall();
        HD4.foodstall();

        }
    }

