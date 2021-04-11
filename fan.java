
public class fan {
    public void fanSpeed(int speed){
        switch(speed){
            case 0:
            System.out.println("fan is off");
            break;
            case 1:
            System.out.println("fan speed is very low");
            break;
            case 2:
            System.out.println("fan speed is low");
            break;
            case 3:
            System.out.println("fan speed is normal");
            break;
            case 4:
            System.out.println("fan speed is fast");
            break;
            case 5:
            System.out.println("fan speed is very fast");
            break;
            default:
            System.out.println("wrong input");
            break;
        }
    }
    public static void main(String[] args) {
        fan obj = new fan();
        obj.fanSpeed(0);
    }
}