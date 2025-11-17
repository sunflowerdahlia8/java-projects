public class operators {
    public static void main(String[] args) {

        // Arithmetic Operators
        int a = 69;
        int b = 18;
        int sum = a + b; 
        int product = a * b;
        System.out.println("69 + 18 = " + sum);
        System.out.println("69 * 18 = " + product);

        // Assignment Operators
        int c = 25;
        c += 10;
        int d = 15;
        d *= 15;
        System.out.println("Sum: " + c);
        System.out.println("Product: " + d);

        // Unary Operators
        int e = 9;
        e++;
        int f = -e;
        System.out.println("Incremented e: " + e);
        System.out.println("Unary minus f: " + f);

        // Comparison Operators
        boolean isLess = (a < b);
        boolean isGreater = (a > b);
        System.out.println("Is a less than b? " + isLess);
        System.out.println("Is a greater than b? " + isGreater);

        // Logical Operators
       int n = 15;
       int o = 20;
       int p = 15;
       int q = 0;
       if ((n < o) && (n == p)) {
        q = n + o + p;
        System.out.println("The sum is: " + q);
    }
        else
        System.out.println("False");

        // Logical Operators
        int r = 1;
        int s = 2;
        int t = 3;
        int u = 4;
        if (r > s || t == u) {
        System.out.println("True");
        }
        else
        System.out.println("False");
    }
}
