import java.util.ArrayList;

public class Bank {
    public String name;
    private ArrayList<String> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public String addBranch(String branchName) {
        if(!findBranch(branchName)){
           this.branches.add(branchName);    
            return "branch added";
        }
        return "exist";
    }

    private boolean findBranch(String branchName) {
        for(int i=0; i < branches.size(); i++) {
            if(branchName == branches.get(i)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Bank bank = new Bank("sbi");
        System.out.println(bank.addBranch("lasalgaon"));
        System.out.println(bank.findBranch("lasalgaon"));
        System.out.println( bank.addBranch("lasalgaon"));
    }
}