public class swapfunc {
    public static void main(String[] args) {
        int a = 30;
        int b = 40;

        // int temp = a;
        // a = b;
        // b = temp;
        swap(a, b);

        
        System.out.println("a = " + a + " " + "b = " + b);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    
}
