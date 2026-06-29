
// Problem 2: Outer Class with Inner Class


class Outer {

    // Method in Outer class
    void display() {
        System.out.println("Display from Outer class");
    }

    // Inner class defined inside Outer class
    class Inner {
        void display() {
            System.out.println("Display from Inner class");
        }
    }
}

// Main class to call both functions
class MainInnerOuter {
    public static void main(String[] args) {
        System.out.println("=== Problem 2: Outer and Inner Class Demo ===");

        // Create object of Outer class and call its display()
        Outer outer = new Outer();
        outer.display();

        // Create object of Inner class using Outer class reference
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}