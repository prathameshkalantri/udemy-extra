
public class sweetShop {
    public String orderFood;
    public double quantity;
    public int rate = 120;
    public double total;
    private double profit = (rate * 30)/100;
    private int passCode = 3003;

    public sweetShop(String foodItem, double quantiy){
        this.orderFood = foodItem;
        this.quantity = quantiy;
        
    }
    
    public double getTotalBill(){
        total = rate * quantity;
        return total; 
    }

    private double getProfit(){

        return profit * quantity;
    }

    public void showprofit(int enterPassCode){
        if(enterPassCode == passCode){
            System.out.println(getProfit());
        }else {
            System.out.println("wrong passcode");
        }

    }
}