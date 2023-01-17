package FactoryMethod;

public class DarkChocolateMaker extends ChocolateMaker{
    @Override
    public ChocolateMaker makeObject() {
        return new DarkChocolateMaker();
    }
    @Override
    public String doneMaking() {
        return "Dark";
    }
}
