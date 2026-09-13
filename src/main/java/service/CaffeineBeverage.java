package service;

public abstract class CaffeineBeverage {

    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected void boilWater() {
        System.out.println("Hirviendo agua");
    }

    protected void pourInCup() {
        System.out.println("Sirviendo en la taza");
    }

    protected abstract String brew();

    protected abstract void addCondiments();

    @Override
    public String toString() {
        return "CaffeineBeverage";
    }
}
