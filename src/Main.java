public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println("Високосным является " + i + " год");
        }
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей ");
        }
        System.out.println("Итого всего " + total + " рублей накоплений ");

        int salary1 = 29000;
        int total1 = 0;
        for (int i = 0; i < 12; i++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + salary1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total1 + " реблей ");

        }
        int a = 2;
        for (int i = 1; i >= 1 && i <= 10; i ++)
        { int result = a * i;
            System.out.println(a + " * " + i + " = " + result);
        }
    }
}