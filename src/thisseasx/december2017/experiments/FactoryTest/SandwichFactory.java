package thisseasx.december2017.experiments.FactoryTest;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

class SandwichFactory {

    static Sandwich createSandwich(SandwichType type) {
        Sandwich s = new Sandwich();
        s.setType(type);
        switch (type) {
            case SANDWICH_1:
                s.addIngredient("Lettuce")
                        .addIngredient("Ham")
                        .addIngredient("Cheese");
                break;
            case SANDWICH_2:
                s.addIngredient("Mushroom")
                        .addIngredient("Ham")
                        .addIngredient("Tomato");
                break;
            case SANDWICH_3:
                s.addIngredient("Cheese")
                        .addIngredient("Omelet")
                        .addIngredient("Egg");
        }
        return s;
    }

    static class Sandwich {

        private List<String> ingredients = new ArrayList<>();
        private SandwichType type;

        private Sandwich() {
        }

        Sandwich addIngredient(String ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        void setType(SandwichType type) {
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
