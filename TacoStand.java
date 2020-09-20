public abstract class TacoStand {

	protected abstract Taco createTaco(String item);

	public Taco orderTaco(String type) {

		Taco taco = createTaco(type);
		System.out.println("Making a " + taco.getName() + ".");

		taco.prepare();
		taco.shape();
		taco.wrap();

		return taco;
	}
	
}