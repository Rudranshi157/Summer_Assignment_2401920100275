

public class LibraryInterfaceDemo{

    public static void main(String[] args) {
        //Test case #1:
        System.out.println("===== Test Case #1 : Kid User =====");

        KidUser kid = new KidUser(10, "Kids");

        kid.registerAccount();
        kid.age = 18;
        kid.registerAccount();

        System.out.println();

        kid.requestBook();
        kid.bookType = "Fiction";
        kid.requestBook();



        //Test case #2:
        System.out.println("\n===== Test Case #2 : Adult User =====");

        AdultUser adult = new AdultUser(5, "kids");
       
        adult.registerAccount();
        adult.age = 23;
        adult.registerAccount();

        System.out.println();

        adult.requestBook();
        adult.bookType = "Fiction";
        adult.requestBook();
    }
}