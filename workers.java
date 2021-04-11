import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

public class workers {
    List<String> workerName;

    public workers() {
        this.workerName = new ArrayList<>();
    }
    public void addWorker(String WorkerName){
        this.workerName.add(WorkerName);
    }

    public void printWokerList(){
        for(String i : workerName){
            System.out.println(i);
        }
    }
    public String isPresent(String WorkerName, boolean present){
        for(int i = 0; i< workerName.size();i++){
            if(WorkerName == workerName.get(i) && present){
                return "present"; 
            }
        }
        return "not present";
    }
    public static void main(String[] args) {
        workers obj = new workers();
        obj.addWorker("vk");
        obj.addWorker("pk");
        obj.addWorker("sk");
        obj.printWokerList();
        System.out.println(obj.isPresent("pk", true));

    }
}