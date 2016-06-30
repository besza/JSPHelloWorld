public class Product {
    public enum Category {
        ELECTRONIC, WEARABLES, BOOKS, ACCESSORY;
    }

    private Category category;
    private String name;
    private double price;
    private int warranty;

    public Product(Category category, String name, double price, int warranty) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.warranty = warranty;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Product product = (Product) object;

        if (Double.compare(product.price, price) != 0) return false;
        if (warranty != product.warranty) return false;
        if (category != product.category) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (category != null ? category.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + warranty;
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Product{" +
                "category=" + category +
                ", price=" + price +
                ", warranty=" + warranty +
                '}';
    }
}