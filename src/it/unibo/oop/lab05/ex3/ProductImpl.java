package it.unibo.oop.lab05.ex3;

import java.util.Objects;

public class ProductImpl implements Product{
    
    private final String name;
    private double quantity;

    public ProductImpl(String name, double quantity) {
        super();
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getQuantity() {
        return this.quantity;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, quantity);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProductImpl other = (ProductImpl) obj;
        return Objects.equals(name, other.name)
                && Double.doubleToLongBits(quantity) == Double.doubleToLongBits(other.quantity);
    }

    @Override
    public String toString() {
        return name + ", quantity = " + quantity;
    }
}
