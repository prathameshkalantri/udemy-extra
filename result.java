import java.util.ArrayList;
import java.util.HashMap;

public class result {
    public double score;
    public String studentName;
    public ArrayList<HashMap<String,Double>> resultList;
    public result(){
        this.resultList = new ArrayList<>();
    }
    public void addResult(HashMap<String,Double> resultName){
        this.resultList.add(resultName);
    }
    public void showScorer(){
        int i = 0;
        
        while(i<resultList.size()){
            if((resultList.get(i).get("marks") >= 90.00)){
            System.out.println(resultList.get(i).get("marks"));
        
            i++;    
            }else{
            System.out.println(resultList.get(i)+ " score below 90");
            i++;
        }
    }

        
        
    }
    public static void main(String[] args) {
        result obj = new result();
        HashMap<String,Double> result1 = new HashMap<>();
        result1.put("marks", 94.20);
        HashMap<String,Double> result4 = new HashMap<>();
        result4.put("marks", 95.00);
        HashMap<String,Double> result2 = new HashMap<>();
        result2.put("marks", 86.20);
        HashMap<String,Double> result3 = new HashMap<>();
        result3.put("marks", 94.20);
        obj.addResult(result1);
        obj.addResult(result2);
        obj.addResult(result3);
        obj.addResult(result4);
        obj.showScorer();
    }
}