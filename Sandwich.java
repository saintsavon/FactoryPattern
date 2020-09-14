import java.util.*;

public abstract class Sandwich {
	String name;

	Bread bread;
	Cheese cheese;
	Meat meat;
	Veggies veggies[];

	abstract void prepare();

	void cut() {
		System.out.println("Cutting your sandwich");
	}

	void wrap() {
		System.out.println("Wrapping your sandwich");
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("  " + name + "  \n");
		if (bread != null) {
			result.append(bread);
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
					result.append(", ");
				}
			}
			result.append("\n");
		}

		return result.toString();
	}

}
