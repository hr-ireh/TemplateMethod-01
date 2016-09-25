package ir.hri.bl;

public class Tea extends Beverages {
    @Override
    public void brew() {
        System.out.println("ریختن چای به داخل آب جوشانده شده");
    }

    @Override
    public void pourInCup() {
        System.out.println("ریختن چای به فنجان");
    }

    @Override
    public void addCondiments() {
        System.out.println("اضافه کردن شکر");
    }
}
