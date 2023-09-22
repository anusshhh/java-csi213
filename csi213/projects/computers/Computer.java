package csi213.projects.computers;

import java.io.*;

/**
 * Each {@code Computer} represents a computer.
 *
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 */
public class Computer implements Serializable {

    /**
     * The serial number of this {@code Computer}.
     */
    protected String serialNumber;

    /**
     * The price of this {@code Computer}.
     */
    protected double price;

    /**
     * Constructs a {@code Computer} instance.
     *
     * @param serialNumber the serial number of the {@code Computer}
     * @param price        the price of the {@code Computer}
     */
    public Computer(String serialNumber, double price) {
        this.serialNumber = serialNumber;
        this.price = price;
    }

    /**
     * Returns the serial number of this {@code Computer}.
     *
     * @return the serial number of this {@code Computer}
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the price of this {@code Computer}.
     *
     * @param price the new price of this {@code Computer}
     */
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "serial number: " + serialNumber + ", price: " + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Computer otherComputer)) {
            return false;
        }
        return this.serialNumber.equals(otherComputer.getSerialNumber());
    }

    /**
     * The main method of the {@code Computer} class.
     *
     * @param args the program arguments
     * @throws Exception if an error occurs
     */
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) throws Exception {
        Computer c = new Computer("s1", 500);
        System.out.println(c);

        System.out.println(c.getSerialNumber());

        c.setPrice(600);
        System.out.println(c);

        System.out.println(c.equals(new Computer("s1", 500)));
        System.out.println(c.equals(new Computer(new String("s1"), 500)));
        System.out.println(c.equals(new Computer("s2", 500)));
        System.out.println(c.equals("s1"));

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.dat"));
        out.writeObject(c);
        out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.dat"));
        System.out.println(in.readObject());
        in.close();
    }

}
