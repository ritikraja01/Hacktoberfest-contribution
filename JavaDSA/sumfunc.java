import java.util.*;

public class sumfunc {
    public static void main(String[] args) {
        // sum();
        // int ans = sum2();
        // System.out.println(ans);

        int ans = sum3(20, 30);
        System.out.println(ans);
    }

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }
    
    // return the value
    // static int sum2() {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter number 1: ");
    //     int num1 = sc.nextInt();
    //     System.out.println("Enter number 2: ");
    //     int num2 = sc.nextInt();
    //     int sum = num1 + num2;

    //     return sum;
        

    // }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;

        System.out.println("The sum is = " + sum);

        sc.close();
}

}