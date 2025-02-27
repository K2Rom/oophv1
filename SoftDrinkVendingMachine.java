
public class SoftDrinkVendingMachine extends VendingMachine {
 
    public Product getProduct(String name, float volume, float temperature) {
        for (Product product : products) {
            if (product.getName().equals(name) && ((BottleOfWater) product).getVolume() == volume
                    && ((SoftDrink) product).getTemperature() == temperature) {
                return product;
            }
        }
        return null;
    }

}
