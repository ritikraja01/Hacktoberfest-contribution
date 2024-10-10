import java.util.Scanner;

public class stringfunc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        String message = greet();
        System.out.println(message);

        String personalised = myGreet(name);
        System.out.println(personalised);


        sc.close();
    }

    private static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }


    
    static String greet() {
        String greeting = "how are you";
        return greeting;
    }
}
