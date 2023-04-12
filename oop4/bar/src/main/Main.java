package main;

public class Main {


    public static void main(String[] args) {
        Ingredient a = new Ingredient("Sok", 100);
        Ingredient b = new Ingredient("Wóda", 50);
        Ingredient c = new Ingredient("Piwo", 50);
        Barman bar = new Barman();

        Drink d1 = bar.createDrink(a, b, c);

        System.out.println(bar.printDrink(d1));
    }
}