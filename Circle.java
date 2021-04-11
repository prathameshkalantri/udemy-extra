public class Circle{
    protected double radius;
    
    public Circle(double radius){
        if(radius < 0){
            radius = 0;
            this.radius = radius;
        }
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public double getArea(){
        double area = Math.PI*radius*radius;
        return area;
    }
    
}