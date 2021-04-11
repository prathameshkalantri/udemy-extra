
public class bmi {
    public double weightInKg;
    public double heightInMeeter;
    public double calculatedBmi;

    public bmi(double weightInKg, double heightInMeeter){

        this.weightInKg = weightInKg;
        this.heightInMeeter = heightInMeeter;
        calculatedBmi = weightInKg/(heightInMeeter *heightInMeeter);
        System.out.format("your bmi is %.2f", calculatedBmi);

        
    }
    public static void main(String[] args) {
        bmi obj = new bmi(78, 1.8);
    }
}