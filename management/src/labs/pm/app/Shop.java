package labs.pm.app;

import java.math.BigDecimal;
import java.math.RoundingMode;

import labs.pm.data.Product;

/***
 * {@code Shop}
 */
public class Shop {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Product p1 = new Product();
        p1.setId(101);
        p1.setName("Tea");
        p1.setPrice(BigDecimal.valueOf(1.99));
        System.out.println(p1.getId());
        System.out.println(p1.getName());
        System.out.println(p1.getPrice());
        System.out.println(p1.getDiscount());
        System.out.println(p1.getDiscount().setScale(2,RoundingMode.FLOOR));
    }
}
