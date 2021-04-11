
public class printing {
    public String printingItem;
    public int quantity;
    public double rateForBillBook = 100;
    public double rateForPatrika = 4.50;
    public double totalBill; 
    
    public void whatToPrint(String printingItem, int quantity){
        this.printingItem = printingItem;
        this.quantity = quantity;
    }

    private void stepsToPrint(){
        switch(printingItem){
            case "billbooks":
            createProof();
            printItem();
            completeNumbering();
            completePerforation();
            completeGathering();
            completeBinding();
            System.out.println(printingItem + " printing completed");
            totalBills();
            break;
            case "patrika":
            createProof();
            printItem();
            System.out.println(printingItem + " printing completed");
            totalBills();
            break;
            default:
            System.out.println("we don't print "+ printingItem);
        }
    }

    public void totalBills(){

        String item = printingItem.toLowerCase();
        if(item == "billbooks"){
        System.out.println((totalBill = rateForBillBook*quantity)+ " is your total bill");
        }else if(item == "patrika"){
            System.out.println((totalBill = rateForPatrika * quantity) + " is your total bill");
        }
    }
    public void showPrinting(){
        stepsToPrint();
    }
    private void createProof(){
        // System.out.println("proof completed");
    }

    private void printItem(){
        // System.out.println("item printed");
    }

    private void completeNumbering(){
        // System.out.println("numbering completed");
    }

    private void completePerforation(){
        // System.out.println("perforation completed");
    }

    private void completeGathering(){
        // System.out.println("gathering completed");
    }

    private void completeBinding(){
        // System.out.println("binding completed");
    }
    
}