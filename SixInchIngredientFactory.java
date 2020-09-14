public class SixInchIngredientFactory implements SandwichIngredientFactory {

    public Bread createBread() {
        return new White();
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