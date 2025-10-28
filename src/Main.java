import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Объекты. Домашнее задание 11.");
        Author levTolstoy = new Author("Лев", "Толстой");
        Author fedorDostoevski = new Author("Федор", "Достоевский");
        Book warAndPeace = new Book(levTolstoy, "Война и мир", 2001);
        System.out.println(warAndPeace.getAuthor() + " " + warAndPeace.getTitle() + " " + warAndPeace.getYear());
        Book idiot = new Book(fedorDostoevski, "Бесы", 1995);
        System.out.println(idiot.getAuthor() + " " + idiot.getTitle() + " " + idiot.getYear());
        idiot.setYear(2000);
        System.out.println(idiot.getAuthor() + " " + idiot.getTitle() + " " + idiot.getYear());
    }
}