package ecommerce.main;

import java.util.List;

class ProductService {
    private final ProductDAO productDAO = new ProductDAO();

    public void displayProducts() {
        List<Product> products = productDAO.getAllProducts();
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.printf("ID: %d | Name: %s | Price: %.2f | Stock: %d%n",
                    product.getId(), product.getName(), product.getPrice(), product.getStock());
        }
    }
}
