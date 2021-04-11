
public class vehicle {
    public int wheel;
    
    public vehicle(int wheel){
        this.wheel = wheel;
    }

    public void vehicleType(){
        if(wheel < 2 || wheel > 8){
            System.out.println("there is no vehicle with "+ wheel + " tires");
        }else if(wheel == 2){
            System.out.println("it is a bike");
        }else if(wheel == 3){
            System.out.println("it is riksha");
        }else if(wheel == 4){
            System.out.println("it is car");
        }else {
            System.out.println("it is a transport vehicle");
        }

    }
    public static void main(String[] args) {
        vehicle obj = new vehicle(50);
        obj.vehicleType();
    }
}