public class numbering {
    public int number = 75;

    public void printNumbers(int number){
        this.number = number;
        for(int i=1; i<=number; i++){
            System.out.println(i);    
        }
    }   
    public static void main(String[] args) {
        numbering obj = new numbering();
        obj.printNumbers(50);
    }
}