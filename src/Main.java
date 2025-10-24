import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Объекты. Домашнее задание 11.");
        Author levTolstoy = new Author("Лев","Толстой");
        System.out.println(levTolstoy.name + levTolstoy.surName);
        Book warAndPeace = new Book(levTolstoy,"Война и мир",2001);
        System.out.println(warAndPeace.author + warAndPeace.title+warAndPeace.year);
    }
}