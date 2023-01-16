package FactoryMethod;

public class ChocolateFactory {
    private ChocolateMaker chocoType;
    public static ChocolateMaker getMaker(ChocolateMaker choco, float gramAmountCocoa, float milkAmount){
        this.chocoType = choco;
        return this.chocoType.makeChocolate;
    }

}