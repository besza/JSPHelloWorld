import java.util.Arrays;
import java.util.List;

/**
 * Created by ui2016 on 6/30/2016.
 */
public class Products {
    private static final List<Product> products = Arrays.asList(
            new Product(Product.Category.ACCESSORY, "Rolex watch", 20000, 5),
            new Product(Product.Category.ELECTRONIC, "Cisco router", 100000, 10),
            new Product(Product.Category.BOOKS, "Clean Code", 5000, 0),
            new Product(Product.Category.WEARABLES, "Baseball hat", 2000, 0),
            new Product(Product.Category.BOOKS, "A prímszámok zenéje", 6000, 0)
    );

    public static List<Product> getProducts() {
        return products;
    }


}
