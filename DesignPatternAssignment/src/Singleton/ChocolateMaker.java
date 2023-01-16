package Singleton;

public class ChocolateMaker {
    private static String name;
    private static final ChocolateMaker chocolateMaker = new ChocolateMaker();
    private ChocolateMaker(){
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public boolean checkIfNull(){
        return  this.chocolateMaker != null ? true : false;
    }
    public static ChocolateMaker getChocolateMaker(String name){
        if(chocolateMaker.checkIfNull()){
            return chocolateMaker;
        }
        System.out.println("Object was not created");
        return null;
    }
}

