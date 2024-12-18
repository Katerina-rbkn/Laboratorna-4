package org.example;

import java.util.Scanner;

public class View {
    public void displayInfo(String text) {
        System.out.println(text);
    }

    public void displayMenu() {
        System.out.println("\n==============================");
        System.out.println("|              Меню            |");
        System.out.println("================================");
        System.out.println("| Виберіть дію:                |");
        System.out.println("|   1. Увімкнути світло        |");
        System.out.println("|   2. Вимкнути світло         |");
        System.out.println("|   3. Увімкнути опалення      |");
        System.out.println("|   4. Вимкнути опалення       |");
        System.out.println("|   5. Активувати сигналізацію |");
        System.out.println("|   6. Вимкнути сигналізацію   |");
        System.out.println("|   7. Замовити їжу            |");
        System.out.println("|   0. Вийти                   |");
        System.out.println("================================");
        System.out.println("Введіть ваш вибір: ");
    }

    public void displayColor() {
        System.out.println("=========================");
        System.out.println("| Виберіть колір:       |");
        System.out.println("|   1. Білий            |");
        System.out.println("|   2. Синій            |");
        System.out.println("|   3. Червоний         |");
        System.out.println("|   4. Зелений          |");
        System.out.println("|   5. Фіолетовий       |");
        System.out.println("|   6. Жовтий           |");
        System.out.println("=========================");
        System.out.println("Введіть ваш вибір: ");
    }

    public void displayFood() {
        System.out.println("=================================");
        System.out.println("|Оберіть що ви хочете замовити: |");
        System.out.println("|  1. Піца                      |");
        System.out.println("|  2. Суші                      |");
        System.out.println("|  3. Борщ з салом і пампушками |");
        System.out.println("|  4. Млинці з сиром            |");
        System.out.println("|  5. Банош                     |");
        System.out.println("|  6. Шоколадний фондан         |");
        System.out.println("|  7. Пиріжки з яблуком         |");
        System.out.println("=================================");
        System.out.println("Введіть ваш вибір:               ");
    }

    public int InputAnswer(int min, int max){
        Scanner scanner = new Scanner(System.in);
        int i = -1;
        while (true) {
            if (scanner.hasNextInt()) {
                i = scanner.nextInt();
                if (i >= min && i <= max) {
                    return i;
                } else {
                    System.out.println("Будь ласка, введіть число в діапазоні від " + min + " до " + max + ".");
                }
            } else {
                System.out.println("Сталася помилка: введіть ціле число.");
                scanner.next();
            }
        }
    }

    public String ChoiceColor(){
        displayColor();
        int colorChoice = InputAnswer(1, 6);
        String color = switch (colorChoice){
            case 1 -> "Білий";
            case 2 -> "Синій";
            case 3 -> "Червоний";
            case 4 -> "Зелений";
            case 5 -> "Фіолетовий";
            case 6 -> "Жовтий";
            default -> "";
        };
        return color;
    }

    public int ChoiceTemperature(){
        displayInfo("Введіть температуру, яку бажаєте встановити від -25 до 30: ");
        return InputAnswer(-25, 30);
    }

    public String ChoiceFood(){
        displayFood();
        int foodChoice = InputAnswer(1, 7);
        String food = switch (foodChoice){
            case 1 -> "Піца";
            case 2 -> "Суші";
            case 3 -> "Борщ з салом і пампушками";
            case 4 -> "Млинці з сиром";
            case 5 -> "Банош";
            case 6 -> "Шоколадний фондан";
            case 7 -> "Пиріжки з яблуком";
            default -> "";
        };
        return food;
    }
}
