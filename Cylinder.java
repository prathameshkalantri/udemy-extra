
public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height,double radius){
        super(radius);
        if(height < 0){
            height = 0;
            this.height = height;
        }
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        double volume = getArea()*height;
        return volume;
    }
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        Cylinder cylinder = new Cylinder(10, 3);
        System.out.format("%.2f\n",cylinder.getVolume());
        System.out.format("%.2f",circle.getArea());
    }
}