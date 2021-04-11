
public class personalInfo {
    public String fullName;
    public int age;
    public String Gender;
    private long adhaarNo;

    public personalInfo(String fullName, int age, String gender, long adhaarNo){
        this.fullName = fullName;
        this.age = age;
        this.Gender = gender;
        this.adhaarNo = adhaarNo;
    } 

    public String getName(){
        return fullName;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return Gender;
    }

    private long getAdhaar(){
        return adhaarNo;
    }

    public void getfullInfo(){
        System.out.println("full name is "+getName());
        System.out.println("age is "+getAge());
        System.out.println("gender is "+getGender());
        System.out.println("adhaar no is "+getAdhaar());
    }

}