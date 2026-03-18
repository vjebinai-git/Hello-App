public class HelloApp {
    public static void main(String[] args) {

<<<<<<< HEAD
        String name = (args.length > 0) ? args[0] : "World";

        System.out.println("Hello, " + name + "!");

=======
        String message;

        if (args.length > 0) {
            String names = String.join(", ", args);
            message = "Hello, " + names + "!";
        } else {
            message = "Hello, World!";
        }

        System.out.println(message);
>>>>>>> feature/UC4-display-multiple-names
    }
}