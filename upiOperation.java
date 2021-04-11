
public class upiOperation {
    public static void main(String[] args) {
        upi obj = new upi("kalantriprathamesh@oksbi", 5000);
        obj.setUpiPin(3003);
        obj.makeTransaction(305);
    }

}