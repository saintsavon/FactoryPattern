import sun.java2d.pipe.SpanShapeRenderer.Simple;

public class Deli {
    SimpleSandwichFactory factory;

    public Deli(SimpleSandwichFactory factory) {
        this.factory = factory;
    }

    public Deli orderSandwich(String type) {
        Deli sandwich;

        sandwich = factory.createSandwich(type);

        sandwich.prepare();
        sandwich.cut();
        sandwich.wrap();
        return sandwich;
    }
}
