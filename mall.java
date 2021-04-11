import java.util.ArrayList;

public class mall {
    public ArrayList<String> shopsInMall;

    public mall(){
        this.shopsInMall = new ArrayList<>();
    }

    public void addShop(String shop){
        this.shopsInMall.add(shop.toLowerCase());
    }

    public String findShop(String shop){
        for(int i = 0; i < shopsInMall.size(); i++){
            if(shop == shopsInMall.get(i)){
                return "shop found";
            }
        }
        return "shop not found";
    }
    public static void main(String[] args) {
        mall obj = new mall();
        obj.addShop("gift");
        obj.addShop("shooes");
        obj.addShop("sports");
        obj.addShop("gift");
        System.out.println(obj.findShop("Gift"));
    }
}