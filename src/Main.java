public class Main {
    public static void main(String[] args) {

        //Задание 1

        int year = 2012;
        leapYearVerification(year);

        //Задание 2

        int clientOs2 = 0;
        int clientDeviceYear = 2012;
        identifyTheOperatingSystem(clientOs2, clientDeviceYear);

        //Задание 3

        int deliveryDistance = 95;
        calculationOfDelivery(deliveryDistance);


    }

    //Задание 1
    public static void leapYearVerification(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    //Задание 2
    public static void identifyTheOperatingSystem(int clientOs2, int clientDeviceYear) {
        if (clientOs2 == 0) {
            System.out.println("Установите версию приложения для iOs по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для iOs по ссылке");
            } else {
                System.out.println("Установите приложение для iOs по ссылке");
            }
        } else if (clientOs2 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для Android по ссылке");
            } else {
                System.out.println("Установите приложение для Android по ссылке");
            }
        }
    }

    //Задание 3

    public static void calculationOfDelivery(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Доставка вашей карты произойдет через 1 день");
        } else if (deliveryDistance <= 60) {
            System.out.println("Доставка вашей карты произойдет через 2 дня");
        } else if (deliveryDistance <= 100) {
            System.out.println("Доставка вашей карты произойдет через 3 дня");
        } else {
            System.out.println("Доставку в ваш регион мы не производим");
        }
    }


}