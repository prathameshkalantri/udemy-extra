
public class market{
    public double time;
    public boolean horn;
    public boolean isOpen(double time){
        if(time < 1 || time > 23.59){
            System.out.println("invalid time");

        }else if(time < 18.00  && time > 9.00){
            return true;
        }
        return false;
    
    }
    


    public static void main(String[] args) {
        market obj = new market();
        System.out.println(obj.isOpen(14));

    }
}