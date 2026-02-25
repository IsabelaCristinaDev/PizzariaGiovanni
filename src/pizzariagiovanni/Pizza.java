package pizzariagiovanni;

import ingredientsextra.Ingredient;
import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected List<Ingredient> ingredients;

    public Pizza() {
        this.ingredients = new ArrayList<>();
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public abstract double getCusto();

    @Override
    public String toString() {
        StringBuilder descricao = new StringBuilder();
        for (Ingredient ingredient : ingredients) {
            descricao.append(ingredient.getName()).append(", ");
        }
       
        if (!descricao.isEmpty()) {
            descricao.setLength(descricao.length() - 2);
        }
        return descricao.toString();
    }
}