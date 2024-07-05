import java.time.LocalDate;

public class SoftDrink extends Product {
    
        private int temperature;
    
    public SoftDrink(String name, double price, LocalDate releaseDate, int temperature) {
        super(name, price, releaseDate);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name = '" + super.getName() + '\'' +
                ", price = " + super.getPrice() +
                ", temprature = " + temperature +
                '}';
    }


}
