import sun.java2d.pipe.SpanShapeRenderer.Simple;

public abstract class Deli {

	protected abstract Sandwich createSandwich(String item);

	public Deli orderSandwich(String type) {

		Sandwich sandwich = createSandwich(type);
		System.out.println(" Making a " + sandwich.getName() + ".";

		sandwich.prepare();
		sandwich.cut();
		sandwich.wrap();

		return sandwich;
	}
	
}