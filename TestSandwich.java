public class TestSandwich {

    public static void main(String[] args) {
        Deli Footlong = new Footlong();
        Deli SixInch = new SixInch();

        Sandwich sandwich = Footlong.orderSandwich("bacon");
        System.out.println("Jaylen ordered a " + sandwich + ".\n");

        Sandwich sandwich = Footlong.orderSandwich("BBQ");
        System.out.println("Jaylen ordered a " + sandwich + ".\n");

        Sandwich sandwich = Footlong.orderSandwich("chicken");
        System.out.println("Jaylen ordered a " + sandwich + ".\n");

        Sandwich sandwich = Footlong.orderSandwich("meatball");
        System.out.println("Jaylen ordered a " + sandwich + ".\n");

        Sandwich sandwich = SixInch.orderSandwich("bacon");
        System.out.println("Jaylen ordered a " + sandwich + ".\n");

        Sandwich sandwich = SixInch.orderSandwich("BBQ");
        System.out.println("Jaylen ordered a " + sandwich + ".\n");

        Sandwich sandwich = SixInch.orderSandwich("chicken");
        System.out.println("Jaylen ordered a " + sandwich + ".\n");

        Sandwich sandwich = SixInch.orderSandwich("meatball");
        System.out.println("Jaylen ordered a " + sandwich + ".\n");
    }
}