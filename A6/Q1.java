package A6;

import java.util.Map;
import java.util.TreeMap;

enum GENDER{
MALE, FEMALE
}
public class Q1 {
    public static void main(String[] args) {
        Map<Long, Contacts> tm = new TreeMap();
        Contacts c1 = new Contacts(9999L,"Ash","abc@gmail.com", GENDER.MALE);
        Contacts c2 = new Contacts(9988L,"A2","abcde@gmail.com", GENDER.FEMALE);

        tm.put(1L,c1);
        tm.put(2L,c2);
        for (Map.Entry<Long, Contacts>entry : tm.entrySet()){
            Long key = entry.getKey();
            Contacts c = entry.getValue();
            c.display();
        }
    }
}
class Contacts{
    Long PhoneNumber;
    String Name;
    String Email;
    private GENDER g;

    public Contacts(Long PhoneNumber, String Name, String Email, GENDER g){
        this.PhoneNumber = PhoneNumber;
        this.Name = Name;
        this.Email = Email;
        this.g = g;
    }
    public void display(){
        System.out.println( "PhoneNumber : " + PhoneNumber + "Name : " + Name + "Email : " + Email + "Gender :" + g );
    }

}
