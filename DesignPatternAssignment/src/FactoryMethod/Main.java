package FactoryMethod;

public class Main {
    public static void main(String[] args){
        ChocolateMaker make= new PlainChocolateMaker().makeObject();
    }
}