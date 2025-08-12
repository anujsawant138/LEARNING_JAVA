import java.util.Scanner;

public class PracticeSet {
    public static void main(String[] args) {
        //1.Convert String to LowerCase
        String a ="Anuj Sawant";
        System.out.println(a.toLowerCase());

        //2.Replace space with underscore
        System.out.println(a.replace(" ","_"));

        //3.WAP to fill in letter template which looks like below, replace <|name|> with some name
        String s = "Dear <|name|>, Thanx a Lot!";
        System.out.println(s.replace("<|name|>","Sawant"));

        //4.WAP to detect double and triple space in a string
        String ss= "Hello  I am Anuj   Sawant, How are you? ";
        System.out.println(ss.indexOf("  ")); //will detect double space
        System.out.println(ss.indexOf("   ")); //will detect triple space

    }
}
