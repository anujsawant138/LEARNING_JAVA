public class StringMethods {
    public static void main(String[] args) {
        String name="ANUJSAWANT";

        System.out.println(name.length());

        System.out.println(name.toLowerCase());

        System.out.println(name.toUpperCase());

        String Name = "     ANUJsAWANT";

        System.out.println(Name.trim());

        System.out.println(name.substring(2));

        System.out.println(name.substring(0,5));

        System.out.println(name.replace('N','M'));

        System.out.println(name.replace("ANUJ","a"));

        System.out.println(name.startsWith("B"));

        System.out.println(name.endsWith("T"));

        System.out.println(name.charAt(2));

        System.out.println(name.indexOf("U"));

        System.out.println(name.indexOf("N",7));

        System.out.println(name.lastIndexOf("N"));

        System.out.println(name.lastIndexOf("S",2));

        System.out.println(name.equals("ANUJSAWANT"));

        System.out.println(name.equalsIgnoreCase("anujsawant"));


        System.out.print("45");
        System.out.println("\r20");


    }
}
