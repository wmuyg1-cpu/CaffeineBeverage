package service;

public class Tea extends CaffeineBeverage {

    @Override
    protected String brew() {
        System.out.println("Preparando té");
        return "Té preparado";
    }

    @Override
    protected void addCondiments() {
        System.out.println("Agregando miel");
    }

    @Override
    public String toString() {
        return "Tea";
    }
}