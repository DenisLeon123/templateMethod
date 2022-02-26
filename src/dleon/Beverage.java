package dleon;

import static dleon.Select.*;

abstract public class Beverage {
    private Boolean selectCond = false;

    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        System.out.println("Would do you Cond? " +selectCondiments());
        if(selectCond) {
            addCondiments();
        }
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater(){
        System.out.println("Boiling water");
    }

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    public Select selectCondiments(){
        return selectCond ? YES : NO;
    }

    public void setSelectCond(Select select){
        selectCond = select == YES;
    }
}
