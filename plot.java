public class plot {
    private double length;
    private double width;

    public plot(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getAreaOfPlot(){
        double areaOfPlot = length * width;
        return areaOfPlot;
    }
}