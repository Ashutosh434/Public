package A6;

import javax.swing.text.html.parser.Parser;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Address {
    private String DateOfBirth;



    Address(String d) {
        DateOfBirth = d;
    }

    public String toString() {
        return DateOfBirth;
    }
}

class Q4 {
    public static void main(String args[]) {
        LinkedList<Address> ml = new LinkedList<Address>();

        ml.add(new Address("11-12-2021"));
        ml.add(new Address("11-12-2001"));
        ml.add(new Address("11-12-2000"));

        for (Address element : ml) {
            String date = String.valueOf(element);
            String [] dateParts = date.split("-");
            String year = dateParts[3];
            Year firstyear = Year.of(Integer.valueOf(year));
            System.out.println(element+ "Your Birthday which is on " +date +" comes in a leap year "+ firstyear.isLeap());
        }
    }
}






