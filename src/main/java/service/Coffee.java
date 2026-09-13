package service;

public class Coffee extends CaffeineBeverage {

    @Override
    protected String brew() {
        System.out.println("Preparando café");
        return "Café preparado";
    }

    @Override
    protected void addCondiments() {
        System.out.println("Agregando azúcar");
    }

    @Override
    public String toString() {
        return "Coffee";
    }
}