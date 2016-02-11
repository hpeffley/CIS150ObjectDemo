package p1;

public class Main {

    public static void main(String[] args) {

        // Create an array of balloons
        Balloon[] things = new Balloon[5];

        //Create a balloon object
        things[0] = new Balloon();

        // Create another balloon project
        things[1] = new Balloon(12, "Yellow");

        // Create another balloon project
        things[2] = new Balloon(6, "red");

        // Print the number of balloons made
        System.out.printf("We made %d balloons%n", Balloon.getQuantity());

        // Destroy the second balloon
        Balloon.destroy(1, things);

        // Print the number of balloons remaining
        System.out.printf("\nWe have %d balloons%n", Balloon.getQuantity());

        //print the first balloon's characteristics
        for (Balloon each : things)
            // Don't print undefined elements
            if (each != null)
                System.out.printf
                        ("\nsize %d inches color is %s%n",
                                each.getSize(),
                                each.getColor());

    }
}

class Balloon {
    private int size;
    private String color;
    private static int quantity = 0;


    //Default constructor
    Balloon() {
        size = 10;
        color = "Orange";
        quantity++;
    }

    // Constructor receives size and color
    Balloon(int arg1, String arg2) {
        size = arg1;
        color = arg2;
        quantity++;
    }

    // Return the size
    int getSize() {
        return size;
    }

    // Return the color
    String getColor() {
        return color;
    }

    // Return the number of balloons
    static int getQuantity() {
        return quantity;
    }

    static void destroy(int i, Balloon[] arg) {
        quantity--;
        arg[i] = null;
    }
}
