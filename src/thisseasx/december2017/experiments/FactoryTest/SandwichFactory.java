package thisseasx.december2017.experiments.FactoryTest;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

class SandwichFactory {

    static Sandwich createSandwich(SandwichType type) {
        SandwichBuilder sb = new SandwichBuilder();
        sb.setType(type);
        switch (type) {
            case SANDWICH_1:
                sb.addIngredient("Lettuce")
                        .addIngredient("Ham")
                        .addIngredient("Cheese");
                break;
            case SANDWICH_2:
                sb.addIngredient("Mushroom")
                        .addIngredient("Ham")
                        .addIngredient("Tomato");
                break;
            case SANDWICH_3:
                sb.addIngredient("Cheese")
                        .addIngredient("Omelet")
                        .addIngredient("Egg");
        }
        return sb.create();
    }

    static class SandwichBuilder {

        private final List<String> ingredients = new ArrayList<>();
        private SandwichType type;

        private SandwichBuilder addIngredient(String ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        private SandwichBuilder setType(SandwichType type) {
            this.type = type;
            return this;
        }

        private Sandwich create() {
            return new Sandwich(ingredients, type);
        }
    }

    static class Sandwich {

        private final List<String> ingredients;
        private final SandwichType type;

        private Sandwich(List<String> ingredients, SandwichType type) {
            this.ingredients = ingredients;
            this.type = type;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(StringUtils.capitalize(type.toString().toLowerCase())).append(":\n");
            ingredients.forEach(x -> sb.append(x).append("\n"));
            return sb.toString();
        }
    }

    enum SandwichType {
        SANDWICH_1,
        SANDWICH_2,
        SANDWICH_3
    }
}
