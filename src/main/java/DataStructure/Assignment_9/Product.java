package DataStructure.Assignment_9;

import java.util.Comparator;

public class Product implements Comparable<Product> {

    // Attributes
    int partkey;
    String name;
    String mfgr; // Manufactor
    String brand;
    String type;
    int size;
    String container;
    double retailPrice;
    String comment;

    // Constructor
    public Product() {
    }

    public Product(String line) {

        String[] lineArray = line.split("\\|");

        try {
            this.partkey = Integer.parseInt(lineArray[0]);
        } catch (Exception e) {
            System.err.println("Error setting para: partkey. Error: " + e.getMessage());
            this.partkey = -1;
        }

        try {
            this.size = Integer.parseInt(lineArray[5]);
        } catch (Exception e) {
            System.err.println("Error setting para: size. Error: " + e.getMessage());
            this.size = -1;
        }

        try {
            this.retailPrice = Double.parseDouble(lineArray[7]);
        } catch (Exception e) {
            System.err.println("Error setting para: retailPrice. Error: " + e.getMessage());
            this.retailPrice = -1.0;
        }

        this.name = lineArray[1];
        this.mfgr = lineArray[2];
        this.brand = lineArray[3];
        this.type = lineArray[4];
        this.container = lineArray[6];
        this.comment = lineArray[8];

    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.retailPrice, other.retailPrice);
    }

    public String toString() {
        return String.format("Product: %s in container: %s, partkey: %d%nPrice: %.1f", this.name, this.container, this.partkey, this.retailPrice);
    }

    public String toCSVFile() {
        return String.format("%d,%s,%s,%s,%s,%d,%s,%.2f,%s",
                             this.partkey, this.name, this.mfgr, this.brand,
                             this.type, this.size, this.container,
                             this.retailPrice, this.comment);
    }

    public static Comparator<Product> bySize = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return Integer.compare(o1.size, o2.size);
        }
    };


}
