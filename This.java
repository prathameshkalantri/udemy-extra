public class This{
    public String firstName;
    public String lastName;
    public int age;

    public This(){
        this.firstName = "pk";
    }
    public String setFirstName(String firstName){
        return this.firstName = firstName;
    }

    public String setLastName(String lastname){
        return this.lastName = lastname;
    }

    public int setAge(int age){
    return this.age = age;
    }

    public static void main(String[] args) {
        This obj = new This();
        obj.setFirstName("pk");
    
        System.out.println(obj.firstName);
    }
}