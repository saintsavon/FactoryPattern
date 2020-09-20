public class StreetTacoIngredientFactory implements TacoIngredientFactory {

    public Tortilla createTortilla() {
        return new Corn();
    }

    public Cheese createCheese() {
        return new Cheddar();
    }

    public Meat createMeat() {
        return new Goat();
    }

    public Salsa createSalsa() {
        return new SalsaVerde();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Lettuce(), new Tomato()};
        return veggies;
    }
}