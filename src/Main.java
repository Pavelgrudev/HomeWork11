
public class Main {
    public static void main(String[] args) {
        checkIsLeapYear(2021);
        whichVersionToInstall(2023);
       if ( calculateDays(95)==0);{
        System.out.println("Доставка займёт " + (calculateDays(95)+ " дней "));
       }
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

    public static int calculateDays(int distance) {
        int days = 1;
        if (distance < 20) {
            return days;
        } else if (distance >= 20 && distance < 60) {
           days = days + 1;
           return days;
        } else if (distance >= 60 && distance <= 100) {
           days = days + 2;
            return days;
        } else {
            return-1 ;
         }}}



