package FactoryMethod;

public class WhiteChocolate extends Chocolate {
    private float gramAmountCocoa;
    private float milkAmount;

    public String makeChocolate(){
        return "White Chocolate made with "+this.gramAmountCocoa+"grams cocoa and "+this.milkAmount+"litres milk";
    }
}
