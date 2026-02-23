public class UC5OOPS {

    public static void main(String[] args) {

        String[] banner = {
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", " ", " ", " ", "OOPS APP", " ", " ", " ", "*"),
                String.join("", "*", " ", "UC5 - ARRAY", " ", "*"),
                String.join("", "*", " ", "INITIALISATION", " ", "*"),
                String.join("", "*", " ", "STRING JOIN", " ", "*"),
                String.join("", "*", " ", "FEATURE", " ", " ", " ", "*"),
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}