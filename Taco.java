public abstract class Taco {
	String name;

	Tortilla tortilla;
	Cheese cheese;
	Meat meat;
	Veggies veggies[];

	abstract void prepare();

	void shape() {
		System.out.println("Shaping your taco");
	}

	void wrap() {
		System.out.println("Wrapping your taco");
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(" " + name + ":\n");
		if (tortilla != null) {
			result.append(tortilla);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		if (meat != null) {
			result.append(meat);
			result.append("\n");
		}
		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length-1) {
					result.append("\n");
				}
			}
			result.append("\n");
		}

		return result.toString();
	}

}
