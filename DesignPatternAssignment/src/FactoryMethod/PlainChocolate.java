package FactoryMethod;

public class PlainChocolate extends ChocolateMaker{
    private float gramAmountCocoa;
    private float milkAmount;
    PlainChocolate(float gramAmountCocoa, float milkAmount){
        this.gramAmountCocoa= gramAmountCocoa;
        this.milkAmount= milkAmount;
    }
    public String makeChocolate(){
        return "Plain Chocolate made with "+this.gramAmountCocoa+"grams cocoa and "+this.milkAmount+"litres milk";
    }
}
