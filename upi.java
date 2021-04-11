
public class upi {
    public String upiId;
    public Double amount;
    private int upiPin;

    public upi(String upiId, double amount){
        this.upiId = upiId;
        this.amount = amount;
    }
    public int setUpiPin(int upiPin){
        return this.upiPin = upiPin;
    }

    public void makeTransaction(int enterUpiPin){
        if(enterUpiPin == upiPin){
        System.out.println("your transaction is succesfull");
  
        }else {
            System.out.println("transection failed");
        
        }
        // int i=3;     
        // if((i-1) > 0){
        //         enterUpiPin = scanner.nextInt();
        //         scanner.nextLine();
        // }
        
                
                       
            
            
        
    }

}