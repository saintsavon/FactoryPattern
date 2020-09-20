public interface TacoIngredientFactory {

    public Tortilla createTortilla();
    public Cheese createCheese();
    public Meat createMeat();
    public Salsa createSalsa();
    public Veggies[] createVeggies();
}