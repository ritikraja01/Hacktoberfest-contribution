public class scopefunc {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Ritik";
        
        calculate(a, b);
        
        {       //block scope

            // int a = 78; // already initialised outside the block in the scope can't be used again
            a = 100;
            int c = 99;
            name = "rahul";

            // value initialised in this block, will remain in the block
            System.out.println(c);
            System.out.println(name);
        }

        System.out.println(a);
        System.out.println(name);

        // System.out.println(c); //? Cannot use outside the block
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);

    }

    static void calculate(int a, int b) {
        int sum = a + b;
        System.out.println("sum = " + sum);
    }
    
}
