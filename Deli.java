import sun.java2d.pipe.SpanShapeRenderer.Simple;

public abstract class Deli {
    SimpleSandwichFactory factory;
 
	public Deli(SimpleSandwichFactory factory) { 
		this.factory = factory;
	}
 
	public Sandwich orderSandwich(String type) {
		Sandwich sandwich;
 
		sandwich = factory.createSandwich(type);
 
		sandwich.prepare();
		sandwich.cut();
		sandwich.wrap();

		return sandwich;
	}

}