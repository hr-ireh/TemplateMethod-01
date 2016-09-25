package ir.hri.bl;

public abstract class Beverages {
    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater() {
        System.out.println("جوشاندن آب");
    }

    public abstract void brew();

    public abstract void pourInCup();

    public abstract void addCondiments();
}
