public class FootlongIngredientFactory implements SandwichIngredientFactory {

    public Bread createBread() {
        return new Wheat();
    }

    public Cheese createCheese() {
        return new Cheddar();
    }

    public Meat createMeat() {
        return new Bacon();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Lettuce(), new Tomato()};
        return veggies;
    }
}