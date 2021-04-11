//plymorphism
public class tv {
    public static void changeChannel(int channelNumber){
        System.out.println("channel changed");
    }
    public static void changeChannel(boolean changeToNext){
        if(changeToNext){
            System.out.println("channel changed to next");
        }else{
            System.out.println("channel not changed");
        }    
    }
    public static void main(String[] args) {
        // tv tvObj = new tv();
        changeChannel(115);
        changeChannel(false);
        
    }
    
}