
public class rationCard1 extends rationCard{
    private String myName;
    
    public rationCard1(String myName, String fatherName,String motherName){
        super(fatherName,motherName);
        this.myName = myName;
    }
    public String getFatherInfo(){
        return getFatherName();
    }
    
    public String getMotherInfo(){
        return (getMotherName());
    }
    
    public String myInfo(){
        return (parentInfo() + "\nmy Name is "+ myName);
    }
    public static void main(String[] args) {
        rationCard1 obj1 = new rationCard1("prathamesh", "bharat","yogita");
        rationCard obj = new rationCard("bk", "yk");
        System.out.println(obj.parentInfo());
        System.out.println(obj1.myInfo());
        System.out.println(obj1.getFatherName());
        System.out.println(obj1.getMotherName());
    }
}