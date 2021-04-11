
public class hall extends plot{
    static plot obj1 = new plot(10, 8);
    double areaOfHall;

    public hall(double length, double width) {
        super(length, width);
        areaOfHall = length * width;
    }

    public double getRemainingAreaOfPlot() {

        double remainingArea = obj1.getAreaOfPlot() - areaOfHall;
        return remainingArea;
    }

    public static void main(String[] args) {
        // plot obj1 = new plot(10,8);
        hall obj = new hall(4, 3);
        System.out.println(obj1.getAreaOfPlot());
        // System.out.println(obj1.getAreaOfPlot() - obj.areaOfHall);

        System.out.println(obj.areaOfHall);
        System.out.println(obj.getRemainingAreaOfPlot());
    }
    
}