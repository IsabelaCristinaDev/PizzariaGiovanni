package pizzariagiovanni;

import ingredientsextra.Ingredient;
import java.util.List;

public class MargheritaPizza extends Pizza {
    public MargheritaPizza() {
        this.ingredients = List.of(
                new Ingredient("Tomate"),
                new Ingredient("Queijo Mozzarella"),
                new Ingredient("Manjericão"),
                new Ingredient("Azeite de Oliva")
        );
    }

    @Override
    public double getCusto() {
        return 22.0; 
    }
}