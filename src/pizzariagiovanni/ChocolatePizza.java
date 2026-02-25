package pizzariagiovanni;

import ingredientsextra.Ingredient;
import java.util.List;

public class ChocolatePizza extends Pizza {
    public ChocolatePizza() { 
        this.ingredients = List.of(
                new Ingredient("Chocolate"),
                new Ingredient("Creme de leite"),
                new Ingredient("Raspas de Chocolate")
        );
    }

    @Override
    public double getCusto() {
        return 18.0; 
    }
}