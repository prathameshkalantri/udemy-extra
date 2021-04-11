import java.util.ArrayList;

public class grocery {
    ArrayList<String> groceryList;
    public grocery (){
        this.groceryList = new ArrayList<>();
    }

    public void addItem(String item){
        this.groceryList.add(item);
        // printGroceryList();
    }

    public void printGroceryList(){
        System.out.println("there are "+ groceryList.size() + " items");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1)+"."+groceryList.get(i));
        }
    }
    
    public void removeItem(String item){
        groceryList.remove(item);
        printGroceryList();
    }

    public static void main(String[] args) {
        grocery obj = new grocery();
        obj.addItem("turdaal");
        obj.addItem("rice");
        obj.addItem("wheet");
        obj.addItem("biscuits");
        // obj.printGroceryList();
        obj.removeItem("wheet");
        // obj.printGroceryList();
    }
}