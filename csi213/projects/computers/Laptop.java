package csi213.projects.computers;

/**
 * Each {@code Laptop} represents a laptop.
 *
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 */
public class Laptop extends Computer {
    double screenSize;
    static int count;

    /**
     * Constructs a {@code Laptop} instance.
     *
     * @param serialNumber the serial number of the {@code Laptop}
     * @param price        the price of the {@code Laptop}
     * @param screenSize   the screen size of the {@code Laptop} in inches
     */
    public Laptop(String serialNumber, double price, double screenSize) {
        super(serialNumber, price);
        this.screenSize = screenSize;
        count+=1;
    }

    /**
     * Returns the number of {@code Laptop}s instantiated so far.
     *
     * @return the number of {@code Laptop}s instantiated so far
     */
    public static int count() {
        return count;
    }

    @Override
    public String toString() {
        return "serial number: "+serialNumber+", price: "+price+", screen size: "+screenSize;
    }

    /**
     * The main method of the {@code Laptop} class.
     *
     * @param args the program arguments
     * @throws Exception if an error occurs
     */
    public static void main(String[] args) throws Exception {
        Laptop l = new Laptop("l1", 1000.0, 13.1);
        System.out.println(l);

        new Laptop("l2", 400.0, 12);
        System.out.println("number of Laptops: " + Laptop.count());
    }

}
