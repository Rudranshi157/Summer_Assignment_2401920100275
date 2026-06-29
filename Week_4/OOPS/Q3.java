
// Problem 3: Point Class with Constructors and Setters


class Point {

    // Private instance variables
    private int x;
    private int y;

    // Constructor 1: Default constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor 2: Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method: set only x
    public void setX(int x) {
        this.x = x;
    }

    // Method: set only y
    public void setY(int y) {
        this.y = y;
    }

    // Method: set both x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Helper method to display the point
    public void display() {
        System.out.println("Point -> x = " + x + ", y = " + y);
    }

    // Main method to test the Point class
    public static void main(String[] args) {
        System.out.println("=== Problem 3: Point Class Demo ===");

        // Using default constructor
        Point p1 = new Point();
        System.out.print("Default Constructor : ");
        p1.display();

        // Using parameterized constructor
        Point p2 = new Point(3, 4);
        System.out.print("Parameterized Constructor : ");
        p2.display();

        // Using setX()
        p1.setX(10);
        System.out.print("After setX(10) on p1 : ");
        p1.display();

        // Using setY()
        p1.setY(20);
        System.out.print("After setY(20) on p1 : ");
        p1.display();

        // Using setXY()
        p2.setXY(7, 8);
        System.out.print("After setXY(7,8) on p2 : ");
        p2.display();
    }
}