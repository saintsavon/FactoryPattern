public interface TacoIngredientFactory {

    public Tortilla createTortilla();
    public Cheese createCheese();
    public Meat createMeat();
    public Veggies[] createVeggies();
}