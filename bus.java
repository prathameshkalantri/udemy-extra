import java.util.Scanner;

public class bus {
    public int totalSeats = 60;
    public int malePassangers;
    public int femalePassangers;
    public int availableSeats = totalSeats - (malePassangers + femalePassangers);

    Scanner scanner = new Scanner(System.in);
    public void addPassanger(){
        
        while(availableSeats > 0){
            System.out.println("enter male passangers");
            malePassangers = scanner.nextInt();
            if(availableSeats < malePassangers){
                System.out.println("only " + availableSeats +" are available");
            }else if(availableSeats == malePassangers){
                System.out.println("seats full");
            }else{
                System.out.println("enter female passangers,"+ " only "+ (availableSeats - malePassangers) + " available");
                femalePassangers = scanner.nextInt();
            }
            if(availableSeats >= (malePassangers + femalePassangers)){
                System.out.println("passangers add sucessfully");   
            }
            availableSeats = availableSeats - (malePassangers + femalePassangers);

            // System.out.println("enter male passangers");
            // malePassangers = scanner.nextInt();
            // System.out.println("enter female passangers");
            // femalePassangers = scanner.nextInt();



            // break;
    // }
        } 
        if(availableSeats<=0){
            System.out.println("seats are full");
        }
    }
    public static void main(String[] args) {
        bus obj = new bus();
        obj.addPassanger();
        // obj.isPalindrom(757);
    }
}