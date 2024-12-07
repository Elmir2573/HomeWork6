public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        for (int i = 1; i <= 10; i++)
            System.out.println(i);

        System.out.println("Задание №2");
        for (int i = 10; i >= 1; i = i - 1)
            System.out.println(i);

        System.out.println("Задание №3");
        for (int b = 0; b <= 17; b = b + 2)
            System.out.println(b);

        System.out.println("Задание №4");
        for (int c = 10; c >= -10; c = c - 1)
            System.out.println(c);

        System.out.println("Задание №5");
        for (int d = 1904; d <= 2096; d = d + 4)
            System.out.println( + d +  " Год является високосным");

        System.out.println("Задание №6");
        for (int e = 7; e <= 98; e = e + 7)
            System.out.println(e);

        System.out.println("Задание №7");
        for (int f = 1; f <= 512; f = f * 2)
            System.out.println(f);

        System.out.println("Задание №8");
        int salary = 29000;
        int total = 0;
        for (int g = 0; g < 12; g = g + 1) {
            total = total + salary;
            System.out.println("Месяц " + (g + 1) + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задание №9");
        int salary2 = 29000;
        int total2 = 0;
        for (int h = 0; h < 12; h = h + 1) {
            total2 = total2 + salary2;
            total2 = total2 + total2 / 100;
            System.out.println("Месяц " + (h + 1) + ", сумма накоплений равна " + total2 + " рублей");
        }
        System.out.println("Задание №10");
        for (int l = 1; l <= 10; l = l + 1) {
            System.out.println("2 * " + l + " = " + 2 * l);
        }
    }
}

