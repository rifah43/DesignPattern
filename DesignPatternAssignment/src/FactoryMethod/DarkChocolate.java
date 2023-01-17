package FactoryMethod;

public class DarkChocolate extends Chocolate {
    private float gramAmountCocoa;
    private float milkAmount;
    public String makeChocolate(){
        return "Dark Chocolate made with "+this.gramAmountCocoa+"grams cocoa and "+this.milkAmount+"litres milk";
    }
}
