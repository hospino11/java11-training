package labs.pm.data;

import static java.math.RoundingMode.HALF_UP;

import java.math.BigDecimal;

/**
 * {@code Product} class represents properties and behaviors of product objects in
 * the Product Management System.
 * <br>
 * Each product has an id, name, and price.
 * <br>
 * Each product can have a discount calculated based on a {@link Product#DISCOUNT_RATE discount rate}.
 *
 * @version 4.0
 * @author hjoo0111
 */
public class Product {

    /**
     * A constant that defines a {@link java.math.BigDecimal BigDecimal} value of the discount rate.
     * <br>
     * Discount rate is 10%.
     */
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

    private int id;
    private String name;
    private BigDecimal price;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    /**
     * Calculates discount based on a product price and {@link Product#DISCOUNT_RATE discount rate}.
     * @return a {@link BigDecimal} value of the discount.
     */
    public BigDecimal getDiscount() {
        return this.price.multiply(DISCOUNT_RATE).setScale(2,  HALF_UP);
    }
}
