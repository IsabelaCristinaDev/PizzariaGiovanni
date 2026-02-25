package ingredientsextra;

import ingredientsextra.IngredienteExtra;
import java.util.List;
import pizzariagiovanni.Pizza;

public class QueijoExtra extends IngredienteExtra {
    public QueijoExtra(Pizza pizza) {
        super(pizza);
        this.ingredients = List.of(new Ingredient("Queijo ")); 
    }

    @Override
    public double getCusto() {
        return pizza.getCusto() + 3.0; 
    }
}