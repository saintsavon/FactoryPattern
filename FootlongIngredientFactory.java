public class FootlongIngredientFactory implements SandwichIngredientFactory {

    public Bread createBread() {
        return new WheatBread();
    }

    public Cheese createCheese() {
        return new CheddarCheese();
    }

    public Meat createMeat() {
        return new Bacon();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Lettuce(), new Tomato()};
        return veggies;
    }
}