import java.util.ArrayList;

public class stock {
    ArrayList<String> stockList;

    public stock(){
        this.stockList = new ArrayList<>();
    }

    public void addProduct(String productname){
        this.stockList.add(productname);
    }

    public String showList(){
        int i=0;
        while(i<stockList.size()){
            System.out.println(stockList.get(i));
            i++;
        }
        return null;
    }
    public static void main(String[] args) {
        stock obj = new stock();
        obj.addProduct("biscuit");
        obj.addProduct("milk");
        obj.addProduct("vegetables");
        obj.addProduct("toasts");
        obj.showList();
    }
}
