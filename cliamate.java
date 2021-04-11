
public class cliamate {
    static void weatherName(String weather){
        switch(weather.toLowerCase()){
            case "summer":
            System.out.println("you should try cold coffee with ice-cream");
            break;
            case "monsoon":
            System.out.println("i wish we eat batata wada in this weather");
            break;
            case "winter":
            System.out.println("can i get a hot coffee");
            break;
            default:
            System.out.println("get anything for me");
        }
    }
    public static void main(String[] args) {
        weatherName("SUMMER");
    }
}