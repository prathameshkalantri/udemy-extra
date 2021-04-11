import java.util.TreeMap;
import java.util.TreeSet;

public class Contact {
    public static void main(String[] args) {
        TreeSet<String> myContacts = new TreeSet<>();
        myContacts.add("Prathamesh , 8180008770" );
        myContacts.add("Bharat, 9422847770");
        // myContacts.remove("[Bharat, 9422847770]");
        
        for(String i : myContacts){
            System.out.println(i);
        }
        
    }
}