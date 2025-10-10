//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("HomeWork3");
// Задание 1.
        int chislo_1 = 123456789;
        byte chislo_2 = 120;
        short chislo_3 = 25345;
        long chislo_4 = 1234567890123L;
        float chislo_5 = 1234.56789f;
        double chislo_6 = 123456789.123456789;
        System.out.println("Значение переменной chislo_1 с типом int равно "+ chislo_1);
        System.out.println("Значение переменной chislo_2 с типом byte равно "+ chislo_2);
        System.out.println("Значение переменной chislo_3 с типом short равно "+ chislo_3);
        System.out.println("Значение переменной chislo_4 с типом long равно "+ chislo_4);
        System.out.println("Значение переменной chislo_5 с типом float равно "+ chislo_5);
        System.out.println("Значение переменной chislo_6 с типом double равно "+ chislo_6);
        // Задание 2.
        float znach_1 = 27.12f;
        long znach_2 = 987678965549L;
        float znach_3 = 2.786f;
        short znach_4 = 569;
        short znach_5 = -159;
        short znach_6 = 27897;
        byte znach_7 = 67;
        // Задание 3.
        short lud_Pav = 23;
        short ann_Ser = 27;
        short ecat_Andr = 30;
        short bumaga = 480;
        System.out.println("На каждого ученика рассчитано "+ (bumaga/(lud_Pav+ann_Ser+ecat_Andr))+" листов бумаги.");
        // Задание 4.
        int proizvod = 16;
        System.out.println("За 20 минут машина произвела " +(proizvod*10)+" штук бутылок.");
        System.out.println("За сутки машина произвела " +(proizvod*30*24)+" штук бутылок.");
        System.out.println("За 3 дня машина произвела " +(proizvod*30*24*3)+" штук бутылок.");
        System.out.println("За 1 месяц машина произвела " +(proizvod*30*24*30)+" штук бутылок.");
        // Задание 5.
        byte kraska = 120;
        int klass = kraska/6;
        System.out.println("В школе, где " + (klass) + " классов, нужно "+ (klass*2) + " банок белой краски и " + (klass*4) + " банок коричневой краски.");
        // Задание 6.
        byte banan = 80;
        byte milk = 105;
        byte ice_cream = 100;
        byte egg = 70;
        int recieptGr = banan*5+milk*2+ice_cream*2+egg*4;
        float recieptKg = (banan*5+milk*2+ice_cream*2+egg*4)/1000f;
        System.out.println("Вес завтрака в граммах = "+ recieptGr);
        System.out.println("Вес завтрака в килограммах = " + recieptKg);
        // Задание 7.
        short ves = 7000;
        int dni_1 = ves/250;
        int dni_2 = ves/500;
        int dni_sred = (dni_1+dni_2)/2;
        System.out.println("На первой диете для похудения потребуется " + dni_1 + " дней.");
        System.out.println("На второй диете для похудения потребуется " + dni_2 + " дней.");
        System.out.println("В среднем для похудения потребуется " + dni_sred + " дней.");
        // Задание 8.
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int newZp;
        int yearZp;
        int yeardelta;
        newZp = masha+masha/10;
        yearZp = newZp*12;
        yeardelta = yearZp-masha*12;
        System.out.println("Маша теперь получает " + newZp + " рублей. Годовой доход вырос на " + yeardelta +  " рублей.");
        newZp = denis+denis/10;
        yearZp = newZp*12;
        yeardelta = yearZp-denis*12;
        System.out.println("Денис теперь получает " + newZp + " рублей. Годовой доход вырос на " + yeardelta +  " рублей.");
        newZp = kristina+kristina/10;
        yearZp = newZp*12;
        yeardelta = yearZp-kristina*12;
        System.out.println("Кристина теперь получает " + newZp + " рублей. Годовой доход вырос на " + yeardelta +  " рублей.");
        }
    }