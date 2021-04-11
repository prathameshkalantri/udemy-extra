
public class mario {
    public String yourName;
    public int goForward = 6;
    public int gobackward = 4;
    public int toFire = 5;
    public int toHighJump = 8;
    public int toForwardLongJump = 9;
    public int toBackwardLongJump = 7;
    public int toBend = 0;

    public  mario(String yourName){
        this.yourName = yourName;
    }

    public void setControl(int goForward, int gobackward,int toFire, int toHighJump, int toForwardLongJump, int toBackwardLongJump, int toBend){
        this.goForward = goForward;
        this.gobackward = gobackward;
        this.toFire = toFire;
        this.toHighJump = toHighJump;
        this.toForwardLongJump = toForwardLongJump;
        this.toBackwardLongJump = toBackwardLongJump;
        this.toBend = toBend;
    }

    public void playGame(int control){
        if(control == goForward){
            System.out.println("forwrd");
        }else if(control == gobackward){
            System.out.println("backward");
        }else if(control == toFire){
            System.out.println("firing");
        }else if(control == toHighJump){
            System.out.println("highJump");
        }else if(control == toBackwardLongJump){
            System.out.println("backward Long Jump");
        }else if(control == toForwardLongJump){
            System.out.println("forwrd long jump");
        }else if(control == toBend){
            System.out.println("bending");
        }else{
            System.out.println("wrog input");
        }
        // switch(control){
        //     case this.goForward :
        //     System.out.println("going Farward");
        //     break;
        //     case gobackward :
        //     System.out.println("going backward");
        //     break;
        //     case toFire :
        //     System.out.println("firing");
        //     break;
        //     case toHighJump :
        //     System.out.println("highJump");
        //     break;
        //     case toForwardLongJump :
        //     System.out.println("forwardLongJump");
        //     break;
        //     case toBackwardLongJump :
        //     System.out.println("backwardLongJump");
        //     break;
        //     case toBend:
        //     System.out.println("bending");
        //     break;
        //     default :
        //     System.out.println("wrong input"); 
         
    
    } 
    public static void main(String[] args) {
        mario obj = new mario("pk");
        // obj.setControl(9, 7, 8, 6, 4, 5, 1);
        obj.playGame(1);
    }
}