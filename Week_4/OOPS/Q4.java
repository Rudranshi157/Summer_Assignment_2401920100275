
// Problem 4: Box and Box3D (Inheritance)


// Base class: Box (handles 2D: length and breadth)
class Box {

    // Protected so subclass can access them
    protected double length;
    protected double breadth;

    // Default constructor
    public Box() {
        this.length = 0;
        this.breadth = 0;
    }

    // Parameterized constructor
    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Set values for Box
    public void setValues(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Area of 2D Box = length × breadth
    public double area() {
        return length * breadth;
    }

    public void display() {
        System.out.println("Box       -> Length: " + length + ", Breadth: " + breadth);
        System.out.println("Box Area  = " + area());
    }
}

// Subclass: Box3D extends Box (adds height for 3D)
class Box3D extends Box {

    // Additional instance variable
    private double height;

    // Default constructor
    public Box3D() {
        super();           // Call Box's default constructor
        this.height = 0;
    }

    // Parameterized constructor
    public Box3D(double length, double breadth, double height) {
        super(length, breadth);   // Call Box's parameterized constructor
        this.height = height;
    }

    // Set values for Box3D
    public void setValues(double length, double breadth, double height) {
        super.setValues(length, breadth);  // Use parent method
        this.height = height;
    }

    // Surface Area of 3D Box = 2(lb + bh + hl)
    @Override
    public double area() {
        return 2 * (length * breadth + breadth * height + height * length);
    }

    // Volume of 3D Box = length × breadth × height
    public double volume() {
        return length * breadth * height;
    }

    @Override
    public void display() {
        System.out.println("Box3D          -> Length: " + length + ", Breadth: " + breadth + ", Height: " + height);
        System.out.println("Surface Area   = " + area());
        System.out.println("Volume         = " + volume());
    }
}

// Main class to test both
class MainBox {
    public static void main(String[] args) {
        System.out.println("=== Problem 4: Box and Box3D (Inheritance) Demo ===\n");

        // --- Test Box (base class) ---
        System.out.println("--- Base Class: Box ---");
        Box b1 = new Box();
        b1.setValues(5, 3);
        b1.display();

        System.out.println();

        Box b2 = new Box(7, 4);
        b2.display();

        System.out.println("\n--- Subclass: Box3D ---");

        // --- Test Box3D (subclass) ---
        Box3D b3d1 = new Box3D();
        b3d1.setValues(4, 3, 2);
        b3d1.display();

        System.out.println();

        Box3D b3d2 = new Box3D(6, 5, 3);
        b3d2.display();
    }
}