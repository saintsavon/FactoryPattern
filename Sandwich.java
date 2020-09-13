import java.util.*;

public abstract class Sandwich {
	String name;
	String bread;
	String length;
	List<String> toppings = new ArrayList<String>();


	public void prepare() {
		System.out.println("Grabbing bread. . . ");
		System.out.println("Selecting desired meats. . . ");
		System.out.println("Selecting desired toppings. . . ");
		System.out.println("Preparing sandwich. . . ");
	}

	public void cut() {
		System.out.println("Cutting your sandwich");
	}

	public void wrap() {
		System.out.println("Wrapping your sandwich");
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(bread + "\n");
		display.append(length + "\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
        }
		return display.toString();
	}

	public String getName() {
		return name;
	}

}
