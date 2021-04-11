
public class washing {
    public int noOfClothes;

    public washing(int noOfClothes){
        this.noOfClothes = noOfClothes;

        if(noOfClothes < 1){
            System.out.println("you haven't put any clothe");
        }else if(noOfClothes > 30){
            System.out.println("you can put maximum 30 clothes");
        }else if(noOfClothes < 10){
            System.out.println("you need half scoop");
        }else if(noOfClothes > 9 && noOfClothes < 20){
            System.out.println("you need 1 scoop");
        }else if(noOfClothes > 19){
            System.out.println("you need 2 scoops");
        }
    }
    // public void display(){
    //     System.out.println("hi");
    // }
    public static void main(String[] args) {
        new washing(31);

    }
}