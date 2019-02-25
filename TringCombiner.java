


import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;


public class TringCombiner {

    public static void main(String args[]){

        System.out.println(name());

        System.out.println("Today Date Is"  +  outputDate());
        System.out.println(nameAndDate());
    }



    public static String outputDate() {
SimpleDateFormat format = new SimpleDateFormat ("2/23/2-19");

return format.format(Date.from(Instant.now()));

    }


    public static String name() {
        String fName = "David";
        String lName = "Knapp";
        String name = fName + " " + lName;
        return name;
    }



    public static String nameAndDate() {
        String combined = (name ())+" " + (outputDate());

return combined;
    }











}
