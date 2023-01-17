package FactoryMethod;

public class WhiteChocolateMaker extends ChocolateMaker{
    @Override
    public ChocolateMaker makeObject() {
        return new WhiteChocolateMaker();
    }
    @Override
    public String doneMaking() {
        return "White";
    }
}
