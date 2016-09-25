package ir.hri.view;


import ir.hri.bl.Coffee;
import ir.hri.bl.Tea;

public class App {
    public static void main(String[] args) {
        System.out.println("----- Coffee -----");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("----- Tea -----");
        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
