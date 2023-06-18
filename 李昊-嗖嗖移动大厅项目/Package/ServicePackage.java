package Package;
public abstract class ServicePackage {
    private double price;

    public ServicePackage() {
    }

    public ServicePackage(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void showlnfo();
}
