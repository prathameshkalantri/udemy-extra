import java.util.Scanner;

public class rides {
    public int taxi;
    public int passanger;
    public double rent;
    public double distance;
    Scanner scanner = new Scanner(System.in);
    public void getPassengers(){
        System.out.println("Please enter no.of passengers: ");
        passanger = scanner.nextInt();
            
        if(passanger <= 0){
            System.out.println("Please enter valid no. of Passanger");
            passanger = scanner.nextInt();
            // scanner.nextLine();
        }
        else{
        System.out.println("no. of passanger enter by you : " + passanger); 
        }
    }

    public void getDistance(){
        System.out.println("Please enter distance in km :");
        distance = scanner.nextDouble();
        if(distance < 1){
            System.out.println("Please enter valid distance");
        }
        else{
            System.out.println("you have enterd distance in km is :" + distance);
        }
         
    }
    public void getTaxi(){
        taxi = (passanger / 4)+1;
            System.out.println("you need "+taxi+" taxi");
    }
    public double getRent(){
        System.out.println("total rent is: ");
        return rent = distance * passanger *5;
    }

    public static void main(String[] args) {
        rides obj = new rides();
        obj.getPassengers();
        obj.getDistance();
        obj.getTaxi();
        // System.out.println(obj.getTaxi());
        System.out.println(obj.getRent());
    }


}