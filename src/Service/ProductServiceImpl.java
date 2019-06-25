package Service;

import Model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<String, Product> products;

    static {
        products = new HashMap<>();
        products.put("Tomato", new Product(1, "Tomato", 2.5, "Fresh", "US"));
        products.put("Potato", new Product(2, "Potato", 4.0, "Fresh", "Canada" ));
        products.put("Cheese", new Product(3, "Cheese", 15.8, "Fresh", "Sweden"));
        products.put("Meat", new Product(4, "Meat", 20.2, "Rotten", "ThaiFood"));
        products.put("Spinach", new Product(5, "Spinach", 3.2, "Fresh", "GB"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getName(), product);
    }

    @Override
    public Product findByName(String name) {
        return products.get(name);
    }

    @Override
    public void update(String name, Product product) {
        products.put(name, product);
    }

    @Override
    public void remove(String name) {
        products.remove(name);
    }
}
