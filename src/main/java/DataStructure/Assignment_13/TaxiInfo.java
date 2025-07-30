package DataStructure.Assignment_13;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;

public class TaxiInfo implements Comparable<TaxiInfo> {

    // attributes
    private String line;
    private double totalPay;

    // constructor
    public TaxiInfo(String line) {
        this.line = line;
    }

    // getters
    public String getLine() {
        return line;
    }

    public double getTotalPay() {
        return totalPay;
    }

    // setter
    public void setTotalPay() {
        String[] parts = this.line.split(",");

        try {
            this.totalPay = Double.parseDouble(parts[parts.length - 1]);
        } catch (Exception e) {
            System.err.println("Error parsing total pay from line: " + this.line);
            e.printStackTrace();
            this.totalPay = Double.parseDouble(null); // default value in case of error
        }
    }

    @Override
    public int compareTo( TaxiInfo o) {
        return Double.compare(this.getTotalPay(), o.getTotalPay());
    }

}
