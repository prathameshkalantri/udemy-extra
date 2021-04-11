
public class rationCard {
    private String fatherName;
    private String motherName;

    public rationCard(String fatherName, String motherName){
        
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

    public String getFatherName(){
        return fatherName;
    }

    public String getMotherName(){
        return motherName;
    }

    public String parentInfo(){
        return ("My father Name is "+ getFatherName() + "\nmy Mother Name is "+ getMotherName());
    }

}