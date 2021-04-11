
public class vote {
    int votes=0;
    int modiVotes = 0;
    int didiVotes = 0;
    public void voting(String candidate){
        switch(candidate.toLowerCase()){
            case "modi":
            System.out.println("you vote for modi");
            modiVotes++;
            votes++; 
            break;
            case "didi":
            System.out.println("you vote for didi");
            didiVotes++;
            votes++;
            break;
            default :
            System.out.println("you vote for nota");
            votes++;
        }
    }
    public static void main(String[] args) {
        vote obj = new vote();
        // obj.voting("hia");
        obj.voting("modi");
        System.out.println("votes for didi : "+obj.didiVotes);
        System.out.println("votes for modi : "+obj.modiVotes);
        System.out.println("total votes : "+obj.votes);
    }
}