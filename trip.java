
public class trip {
    public int noOfdays;
    public int distance;
    public int noOfPeople;
    public int expenditure;
    
    public void makePlan(int noOfdays, int distance, int noOfPeople){
        this.noOfdays = noOfdays;
        this.noOfPeople = noOfPeople;
        this.distance = distance; 
    }

    public int getExpenditure(){
        expenditure = ((500*noOfdays)+(2000*noOfPeople)+(10*distance));
        return expenditure;
    }

    public static void main(String[] args) {
        trip tripObj = new trip();
        tripObj.makePlan(5, 500, 5);
        System.out.println(tripObj.getExpenditure());
    }
}