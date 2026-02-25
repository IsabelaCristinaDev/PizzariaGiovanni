package pizzariagiovanni;

import ingredientsextra.Ingredient;
import java.util.List;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() { 
        this.ingredients = List.of(
                new Ingredient("Tomate"),
                new Ingredient("Queijo"),
                new Ingredient("Sal"),
                new Ingredient("Oregano"),
                new Ingredient("Pepperoni")
        );
    }

    @Override
    public double getCusto() {
        return 25.0; 
    }
}