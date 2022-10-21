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
        Choice_recipe choice_recipe = new Choice_recipe();

        System.out.println(choice_recipe.getChoice(a));
    }
}
class Choice_recipe {
       public String getChoice (int a){
        String recipe;
            switch (a) {
            case 1 -> recipe = "минимально неразделимый процесс";
            case 2 -> recipe = "эспрессо + добавление воды";
            case 3 -> recipe = "эспрессо + добавление вспененного молока";
            case 4 -> recipe = "выбор чайного пакетика + добавление воды";
            default -> recipe = "ищите другой автомат";
            }
        return recipe;
        }


}
