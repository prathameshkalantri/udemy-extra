
public class people {
    public String name;
    public int age;

    public people(String name, int  age){
        this.name = name;
        this.age = age;
    }

    public void ageStatus(){
        if(age < 0 || age > 100){
            System.out.println("invalid age");
        }else if(age < 12){
            System.out.println("the person is child");
        }else if(age > 11 && age < 20){
            System.out.println("the prson is teenager");
        }else if(age > 19 && age < 50){
            System.out.println("person is adult");
        }else{
            System.out.println("person is old");
        }
    }
    public static void main(String[] args) {
        people obj = new people("pk", 20);
        obj.ageStatus();
    }

}