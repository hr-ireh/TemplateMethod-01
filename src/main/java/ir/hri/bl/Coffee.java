package ir.hri.bl;

public class Coffee extends Beverages {
    @Override
    public void brew() {
        System.out.println("ریختن پودر قهوه به داخل آب جوشانده شده");
    }

    @Override
    public void pourInCup() {
        System.out.println("ریختن قهوه به فنجان");
    }

    @Override
    public void addCondiments() {
        System.out.println("اضافه کردن شیر و شکر");
    }
}
