//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Массивы, урок 1. Домашнее задание №8.");
        // Задание 1.
        int mass[] = new int[3];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i + 1;
        }
        double massiv[] = {1.57, 7.654, 9.986};
        for (int i = 0; i < massiv.length; i++) {
        }
        int massive[] = new int[12];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = i * i;
        }
        // Задание 2.
        for (int i = 0; i < mass.length; i++) {
            if (i == mass.length - 1) {
                System.out.println(mass[i]);
                break;
            }
            System.out.print(mass[i] + ", ");
        }
        for (int i = 0; i < massiv.length; i++) {
            if (i == massiv.length - 1) {
                System.out.println(massiv[i]);
                break;
            }
            System.out.print(massiv[i] + ", ");
        }
        for (int i = 0; i < massive.length; i++) {
            if (i == massive.length - 1) {
                System.out.println(massive[i]);
                break;
            }
            System.out.print(massive[i] + ", ");
        }
        //Задание 3.
        int temp;
        double tempD;
        for (int i = 0; i < mass.length / 2; i++) {
            temp = mass[i];
            mass[i] = mass[mass.length - 1 - i];
            mass[mass.length - 1 - i] = temp;
        }
        for (int i = 0; i < mass.length; i++) {
            if (i == mass.length - 1) {
                System.out.print(mass[i]);
                break;
            }
            System.out.print(mass[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < massiv.length / 2; i++) {
            tempD = massiv[i];
            massiv[i] = massiv[massiv.length - 1 - i];
            massiv[massiv.length - 1 - i] = tempD;
        }
        for (int i = 0; i < massiv.length; i++) {
            if (i == massiv.length - 1) {
                System.out.print(massiv[i]);
                break;
            }
            System.out.print(massiv[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < massive.length / 2; i++) {
            temp = massive[i];
            massive[i] = massive[massive.length - 1 - i];
            massive[massive.length - 1 - i] = temp;
        }
        for (int i = 0; i < massive.length; i++) {
            if (i == massive.length - 1) {
                System.out.print(massive[i]);
                break;
            }
            System.out.print(massive[i] + ", ");
        }
        System.out.println();
        //Задание 4.
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 != 0) {
                mass[i] = mass[i] + 1;
            }
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 != 0) {
                massive[i] = massive[i] + 1;
            }
            System.out.print(massive[i] + " ");
        }
    }
}