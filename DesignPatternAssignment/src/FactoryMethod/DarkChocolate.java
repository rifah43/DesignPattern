package FactoryMethod;

public class DarkChocolate extends ChocolateMaker{
    private float gramAmountCocoa;
    private float milkAmount;
    DarkChocolate(float gramAmountCocoa, float milkAmount){
        this.gramAmountCocoa= gramAmountCocoa;
        this.milkAmount= milkAmount;
    }
    public String makeChocolate(){
        return "Dark Chocolate made with "+this.gramAmountCocoa+"grams cocoa and "+this.milkAmount+"litres milk";
    }
}
