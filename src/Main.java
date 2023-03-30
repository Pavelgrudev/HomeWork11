
public class Main {
    public static void main(String[] args) {
        checkIsLeapYear (2021);
        whichVersionToInstall(2014);
        deliveryDistance(95);}

    public static void checkIsLeapYear(int year) {
        System.out.println("задача № 1");
        if (year % 4 == 0 && year != 0 || year%400==0) {
            System.out.println(year + "Год високосный");}else
            System.out.println(year + "Год невисокосный");}
    public static void whichVersionToInstall(int whichVersionToInstall){
        System.out.println("Задача № 2");
        int clientOS = 0;
        if(clientOS==0){
            if (whichVersionToInstall < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке».");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");}
        } else {
            if (whichVersionToInstall < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");}}
    }
    public static void deliveryDistance(int deliveryDistance) {
        System.out.println("Задача № 3");
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется день что бы доставить груз на " + deliveryDistance + " км.");
        } else if
        (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется  2 дня для доставки на " + deliveryDistance + " км.");
        } else if
        (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется  3 дня для доставки на " + deliveryDistance + " км.");
        } else {
            System.out.println("Доставка нет на " + deliveryDistance + " км. слишком большое расстояние");
        }
    }
}









