public class HelloApp {
    public static void main(String[] args) {

        // Case 1: No arguments → default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {
            // Use StringBuilder for efficient string building
            StringBuilder names = new StringBuilder();

            // Enhanced for loop (for-each)
            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", "); // add comma only after first element
                }
                names.append(name);
            }

            // Final output
            System.out.println("Hello, " + names + "!");
        }
    }
}