package it.unibo.oop.lab05.ex3;

import java.util.HashSet;
import java.util.Set;
//import java.util.stream.Collectors;

public class WarehouseImpl implements Warehouse{
    
    private final Set<Product> products;
        
    public WarehouseImpl(Set<Product> products) {
        super();
        this.products = products;
    }

    @Override
    public void addProduct(Product p) {
        this.products.add(p);
    }

    @Override
    public Set<String> allNames() {
        final Set<String> strings = new HashSet<>();
        for (final Product product : products) {
            strings.add(product.getName());
        }
        return strings;
        /*return products.stream()
                       .map(p -> p.getName())
                       .collect(Collectors.toSet());*/
    }

    @Override
    public Set<Product> allProducts() {
        return this.products;
    }
    

    @Override
    public boolean containsProduct(Product p) {
        return products.contains(p);
    }

    @Override
    public double getQuantity(String name) {        
        for (final Product product : products) {
            if(product.getName().equals(name)) {
                return product.getQuantity();
            }
        }
        return 0;
    }
    
    public Set<Product> getProducts(){
        return this.products;
    }
    
}
