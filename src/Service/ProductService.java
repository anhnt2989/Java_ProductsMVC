package Service;

import Model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void save(Product product);

    Product findByName(String name);

    void update(String name, Product product);

    void remove(String name);
}
