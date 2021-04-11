import java.util.ArrayList;

public class classRoom {
    ArrayList<String> studentList;

    public classRoom(){
        this.studentList = new ArrayList<>();
    }

    public void addStudent(String name){
        this.studentList.add(name);
    }

    public String findStudent(String name){
        for(int i = 0; i < studentList.size(); i++){
            if(name == this.studentList.get(i)){
                return "student found";
            }
            
        }
       return "Student not found";
    }
    public static void main(String[] args) {
        classRoom obj = new classRoom();
        obj.addStudent("prathamesh");
        obj.addStudent("vyanky");
        obj.addStudent("saurabh");
        System.out.println(obj.findStudent("prathamesh"));
    }
}