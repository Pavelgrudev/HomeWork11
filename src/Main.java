
public class Main {
    public static void main(String[] args) {
        checkIsLeapYear(2021);
        whichVersionToInstall(2023);
        }

    public static void checkIsLeapYear(int year) {
        System.out.println("задача № 1");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "Год високосный");
        } else
            System.out.println(year + "Год невисокосный");
    }

    public static void whichVersionToInstall(int whichVersionToInstall) {
        System.out.println("Задача № 2");
        int clientOS = 0;
        if (clientOS == 0) {
            if (whichVersionToInstall < 2023) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке».");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (whichVersionToInstall < 2023) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }}}
    public int deliveryDistance () {
        deliveryDistance(95);
        int day = 0;
        return day;
    }


    public int  deliveryDistance(int deliveryDistance) {
        System.out.println("Задача № 3");
        int day=0;
        if (deliveryDistance<=20) {
            day=day+1;
        } else if
        (deliveryDistance > 20 && deliveryDistance < 60) {
            day=day+2;
        } else if
        (deliveryDistance >= 60 && deliveryDistance <= 100) {
            day=day+3;
        } else {
            System.out.println();}
        System.out.println(day);
        return day;

        }}








