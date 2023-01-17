package FactoryMethod;

public class PlainChocolateMaker extends ChocolateMaker{
    @Override
    public ChocolateMaker makeObject() {
        return new PlainChocolateMaker();
    }

    @Override
    public String doneMaking() {
        return "Plain";
    }
}
