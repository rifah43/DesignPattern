package FactoryMethod;

public class WhiteChocolate extends ChocolateMaker{
    private float gramAmountCocoa;
    private float milkAmount;
    WhiteChocolate(float gramAmountCocoa, float milkAmount){
        this.gramAmountCocoa= gramAmountCocoa;
        this.milkAmount= milkAmount;
    }
    public String makeChocolate(){
        return "White Chocolate made with "+this.gramAmountCocoa+"grams cocoa and "+this.milkAmount+"litres milk";
    }
}
