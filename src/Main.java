import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Product smartSam = new Product(235, "Samsung F40", 23500, "Телефон");
        Product smartTV = new Product(235, "Samsung RG 235", 57999, "Телевизор");
        Product smartNoc = new Product(295, "Nokia 4570", 23700, "Телефон");
        Product smartApp = new Product(125, "iPhone23", 34000, "Телефон");
        Product smartSams = new Product(235, "Samsung F50", 25500, "Телефон");
        System.out.println(smartSam);
        System.out.println(smartTV);
        System.out.println(smartApp);
        System.out.println(smartNoc);
        System.out.println(smartSams);
        // Сравнение товаров
        System.out.println("Сравнение товаров 1 и 4: " + smartApp.equals(smartSam));
        System.out.println("Сравнение товаров 1 и 5: " + smartSam.equals(smartSams));
        // Заполнение корзины покупателя
        Product[] products = {smartApp, smartNoc, smartTV};
        Product[] productsCopy = {smartApp, smartNoc, smartTV};
        Product[] productsNew = {smartSams, smartApp};
        Product[] productsTwo = {smartApp,smartNoc,smartTV};
        Order aleksandr = new Order("Александр", products);
        Order aleksandrCopy = new Order("Александр", productsCopy);
        Order aleksandrNew = new Order("Александр", productsNew);
        Order nikolay = new Order("Николай", productsTwo);
        // Вывод и сравнение корзин (1 и 4 покупатель отличаются именем, 1 и 3 корзиной покупок)
        System.out.println(aleksandr);
        System.out.println(aleksandrCopy);
        System.out.println(aleksandrNew);
        System.out.println(nikolay);
        System.out.println("Сравнение корзин покупателей 1 и 2: " + aleksandr.equals(aleksandrCopy));
        System.out.println("Сравнение корзин покупателей 1 и 3: " + aleksandr.equals(aleksandrNew));
        System.out.println("Сравнение козин покупателей 1 и 4: " + aleksandr.equals(nikolay));
    }
}