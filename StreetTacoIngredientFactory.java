public class StreetTacoIngredientFactory implements TacoIngredientFactory {

    public Tortilla createTortilla() {
        return new Corn();
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