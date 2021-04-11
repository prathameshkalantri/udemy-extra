
public class ticketPrice {
    public int age;
    public int ticketRate;
    public double halfRate;
    public ticketPrice(int age, int ticketRate){
        this.ticketRate = ticketRate;
        if(age < 12){
            halfRate = Math.round(ticketRate / 2);
            System.out.println("Price for the ticket is : "+ halfRate);
        }
        else{
        
        System.out.println("Price for the ticket is: "+ticketRate);
        }
    }
    public static void main(String[] args) {
        ticketPrice obj = new ticketPrice(11, 157);
    }
}