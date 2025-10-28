import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
Product smartSam = new Product(235,"Samsung F40",23500,"Телефон");
Product smartTV = new Product(235, "Samsung RG 235", 57999,"Телевизор");
Product smartNoc = new Product(295,"Nokia 4570",23700,"Телефон");
Product smartApp = new Product(125,"iPhone23",34000,"Телефон");
System.out.println(smartSam);
System.out.println(smartTV);
System.out.println(smartApp);
System.out.println(smartNoc);
    }
}