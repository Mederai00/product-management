package labs.pm.data;

import java.math.BigDecimal;
import java.time.LocalDate;

public sealed abstract class Product permits Food,Drink {

    final private int id;
    final private String name;
    final private BigDecimal price;
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
    private Rating rating;


    Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getDiscount() {
        return price.multiply(DISCOUNT_RATE);
    }

    public Rating getRating() {
        return rating;
    }

    public LocalDate getBestBefore(){
        return LocalDate.now();
    };

    public abstract Product applyRating(Rating newRating);

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", rating=" + rating + ", bestBefore=" + getBestBefore() +  "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
        if (!(obj instanceof Product))
            return false;
        Product other = (Product) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    
    
}
