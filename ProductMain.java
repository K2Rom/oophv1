import java.time.LocalDate;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {

        SoftDrink teablack = new SoftDrink("Чай черный горячий", 6f, LocalDate.of(2024, 07, 01), 55);
        SoftDrink teagreen = new SoftDrink("Чай зеденый горячий", 6f, LocalDate.of(2024, 07, 01), 55);
        SoftDrink teablacklime = new SoftDrink("Чай черный горячий с лимоном", 7.5f, LocalDate.of(2024, 07, 11), 50);
        SoftDrink teagreenlime = new SoftDrink("Чай зеленый горячий с лимоном", 7.5f, LocalDate.of(2024, 07, 11), 50);
        SoftDrink teagreenlimecold = new SoftDrink("Чай зеленый холодный с лимоном", 8f, LocalDate.of(2024, 06, 10), 10);
        SoftDrink teagreencold = new SoftDrink("Чай зеленый холодный", 7f, LocalDate.of(2024, 06, 10), 10);
        SoftDrink americano = new SoftDrink("Кофе Американо", 4.5f, LocalDate.of(2024, 07, 1), 55);
        SoftDrink cacao = new SoftDrink("Какао", 8f, LocalDate.of(2024, 07, 1), 55);
        
        VendingMachine machine_1 = new SoftDrinkVendingMachine();
        VendingMachine machine_2 = new SoftDrinkVendingMachine();
        
        machine_1.addProducts(List.of(teablack, cacao, teagreen, teagreen, teagreenlime, teagreenlimecold));
        machine_2.addProducts(List.of(teagreencold, teagreen, teablacklime, teagreencold, teablack, americano, americano, cacao, cacao));

        System.out.println(machine_1.getProducts());
        System.out.println(machine_2.getProducts());

    }
}
