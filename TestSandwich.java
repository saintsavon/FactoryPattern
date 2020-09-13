public class TestSandwich {

    public static void main(String[] args) {
        Deli Footlong = new Footlong();
        Deli SixInch = new SixInch();

        Sandwich sandwich = Footlong.createSandwich("BLT");
        System.out.println("Jaylen ordered a " + sandwich.getName() + "\n");
    }
}