
public class calculator {
    public double number1,number2;
    double addition;
    double substraction;
    double multiplication;
    double division;
    public calculator(double number1, double number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    public double getAddition(){
        return addition = number1 + number2;
    }

    public double getSubstraction(){
        return substraction = number1 - number2;
    }

    public double gertMultiplication(){
        return multiplication = number1 * number2;
    }

    public double getDividion(){
        return division = number1 / number2;
    }

    public static void main(String[] args) {
        calculator obj = new calculator(248,24);
        System.out.format("%.2f",obj.getAddition());
    }
}