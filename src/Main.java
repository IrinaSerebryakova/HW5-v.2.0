import java.util.Scanner;

public class Main {
        public static void main (String[] args){
            Scanner scan = new Scanner(System.in);

            //Task 1
            System.out.println("Для скачивания мобильного приложения выберите" +
                    "операционную систему вашего смартфона:\n" +
                    "нажмите 0 - для iOS, 1 - для Android");

            int clientOS = scan.nextInt();
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                default:
                    System.out.println("Неправильный ввод");
            }


            //Task 2
            System.out.println("Для скачивания мобильного приложения выберите" +
                    "операционную систему вашего смартфона:\n" +
                    "нажмите 0 - для iOS, 1 - для Android");
            int clientOS1 = scan.nextInt();
            System.out.println("Введите год выпуска вашего смартфона:");
            int input = scan.nextInt();
            int clientDeviceYear = 2015;

            if (clientOS1 == 0 && input < clientDeviceYear) {
                System.out.println("Установите облегченную версию" +
                        "приложения для iOS по ссылке");
            } else if (clientOS1 == 0 && input >= clientDeviceYear) {
                System.out.println("Установите версию приложения" +
                        "для iOS по ссылке");
            } else if (clientOS1 == 1 && input < clientDeviceYear) {
                System.out.println("Установите облегченную версию" +
                        "приложения для Android по ссылке");
            } else if (clientOS1 == 1 && input >= clientDeviceYear) {
                System.out.println("Установите версию приложения" +
                        "для Android по ссылке");
            } else {
                System.out.println("Неправильный ввод");
            }


            //Task 3
            System.out.println("Для того, чтобы определить, является год високосным " +
                    "или нет, введите в консоль интересующий вас год:");

            int year = scan.nextInt();
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " год является високосным.");
                    }
                } else {
                    System.out.println(year + " год является високосным.");
                }
            } else {
                System.out.println(year + " год не является високосным");
            }


            //Task 4
            int deliveryDistance = 95;
            int deliveryTime = 1;

            if (deliveryDistance < 0) {
                System.out.println("Неправильный ввод");
            }
            if (deliveryDistance >= 100) {
                System.out.println("Доставка на расстояние выше 100 км не осуществляется");
            }
            if (deliveryDistance > 0 && deliveryDistance < 100) {
                if (deliveryDistance < 20) {
                    deliveryTime = 1;
                } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
                    deliveryTime = 2;
                } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
                    deliveryTime = 3;
                }
                System.out.println("Потребуется дней для доставки: " + deliveryTime);
            }


            //Task 5
            int monthNumber = 12;

            switch (monthNumber) {
                case 12, 1, 2:
                    System.out.println("winter");
                    break;
                case 3, 4, 5:
                    System.out.println("spring");
                    break;
                case 6, 7, 8:
                    System.out.println("summer");
                    break;
                case 9, 10, 11:
                    System.out.println("autumn");
                    break;
                default:
                    System.out.println("error");
            }
        }
    }

