package service;

public class Main {

    public static void main(String[] args) {

        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();

        System.out.println("Preparando café:");
        coffee.prepareRecipe();

        System.out.println();

        System.out.println("Preparando té:");
        tea.prepareRecipe();

        System.out.println();

        System.out.println(coffee.toString());
        System.out.println(tea.toString());
    }
}