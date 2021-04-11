
public class lighting {
    public double time;

    public lighting(double time){
        this.time = time;
        if(time <= 0.0 || time > 23.59){
            System.out.println("invalid time");
        }else if(time > 5.30 || time < 18.30){
            System.out.println("lights are off");
        }else if(time < 5.30 || time > 18.30){
            System.out.println("lights are on");
        }

    }
    public static void main(String[] args) {
        lighting obj = new lighting(0.1);
    }
}