package FactoryMethod;

public class PlainChocolate extends Chocolate {
    private float gramAmountCocoa;
    private float milkAmount;

    public String makeChocolate(){
        return "Plain Chocolate made with "+this.gramAmountCocoa+"grams cocoa and "+this.milkAmount+"litres milk";
    }
}
