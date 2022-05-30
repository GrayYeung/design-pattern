package com.demo.designpattern.factory.after.pizza;

import com.demo.designpattern.factory.after.ingredients.NYPizzaIngredientFactory;
import com.demo.designpattern.factory.after.ingredients.PizzaIngredientFactory;
import com.demo.designpattern.factory.after.pizza.pizzas.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class NYPizzaStore extends PizzaStore {

    private PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory(); // by design, NY store paired with NY Factory

    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> {
                Pizza pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                yield pizza;
            }
            case "veggie" -> {
                Pizza pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
                yield pizza;
            }
            case "clam" -> {
                Pizza pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                yield pizza;
            }
            case "pepperoni" -> {
                Pizza pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                yield pizza;
            }
            default -> null;
        };
    }
}
