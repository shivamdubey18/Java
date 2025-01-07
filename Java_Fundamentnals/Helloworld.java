// public class Helloworld {
//     public static void main(String[] args) {
//         System.out.println("Hello World!");
//     }
// }
public class Helloworld {
    // Main method used by JVM to start the program
    public static void main(String[] args) {
        System.out.println("Main method with String[] args");
        main(10); // Calling the overloaded main method
    }

    // Overloaded main method
    public static void main(int number) {
        System.out.println("Main method with int: " + number);
    }

    // Another overloaded main method
    public static void main(String arg1, String arg2) {
        System.out.println("Main method with two String parameters: " + arg1 + ", " + arg2);
    }
}
