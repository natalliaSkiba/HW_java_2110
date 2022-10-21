package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите напиток :");
        System.out.println(" 1 : Эспрессо  ");
        System.out.println(" 2 : Американо  ");
        System.out.println(" 3 : Капучино  ");
        System.out.println(" 4 : Чай  ");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
         String resept;


        switch (a) {
            case 1 -> resept = "минимально неразделимый процесс";
            case 2 -> resept = "эспрессо + добавление воды";
            case 3 -> resept = "эспрессо + добавление вспененного молока";
            case 4 -> resept = "выбор чайного пакетика + добавление воды";
            default -> resept = "ищите другой автомат";
        }
        System.out.println(resept);

    }
}