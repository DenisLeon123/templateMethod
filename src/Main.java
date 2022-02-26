import static dleon.Select.*;

import dleon.Coffee;
import dleon.Tea;

public class Main {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.setSelectCond(YES);
        tea.prepareRecipe();

        Coffee coffee = new Coffee();
        coffee.setSelectCond(NO);
        coffee.prepareRecipe();
    }
}
