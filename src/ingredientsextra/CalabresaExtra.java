package ingredientsextra;

import ingredientsextra.IngredienteExtra;
import java.util.List;
import pizzariagiovanni.Pizza;

public class CalabresaExtra extends IngredienteExtra {
    public CalabresaExtra(Pizza pizza) {
        super(pizza);
        this.ingredients = List.of(new Ingredient("Calabresa")); 
    }

    @Override
    public double getCusto() {
        return pizza.getCusto() + 5.0; 
    }
}