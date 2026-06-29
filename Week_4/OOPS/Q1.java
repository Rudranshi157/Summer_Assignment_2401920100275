
// Problem 1: Interface with Implementation


// Step 1: Define the interface
interface Test {
    int square(int n);
}

// Step 2: Implement the interface in Arithmetic class
class Arithmetic implements Test {
    @Override
    public int square(int n) {
        return n * n;
    }
}

// Step 3: Use Arithmetic object in ToTestInt class
class ToTestInt {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();

        System.out.println("=== Problem 1: Interface Demo ===");
        System.out.println("Square of 5  = " + obj.square(5));
        System.out.println("Square of 9  = " + obj.square(9));
        System.out.println("Square of 12 = " + obj.square(12));
    }
}