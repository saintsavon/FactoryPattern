public class AmericanTacoIngredientFactory implements TacoIngredientFactory {

    public Tortilla createTortilla() {
        return new Flour();
    }

    public Cheese createCheese() {
        return new Mozzarella();
    }

    public Meat createMeat() {
        return new Pork();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Lettuce(), new Tomato()};
        return veggies;
    }
}