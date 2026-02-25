package ingredientsextra;

import java.util.ArrayList;
import java.util.List;
import pizzariagiovanni.Pizza;

public abstract class IngredienteExtra extends Pizza {
    protected Pizza pizza;

    public IngredienteExtra(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public List<Ingredient> getIngredients() {
        List<Ingredient> allIngredients = new ArrayList<>(pizza.getIngredients());
        allIngredients.addAll(this.ingredients);
        return allIngredients;
    }

    @Override
    public String toString() {
        StringBuilder descricao = new StringBuilder(pizza.toString());
        for (Ingredient ingredient : ingredients) {
            descricao.append(", ").append(ingredient.getName());
        }
        return descricao.toString();
    }

    @Override
    public abstract double getCusto();
}