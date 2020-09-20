public class TestTaco {

    public static void main(String[] args) {
        
        TacoStand Footlong = new StreetTaco();
        TacoStand SixInch = new AmericanTaco();

        Taco taco = Footlong.orderTaco("bacon");
        System.out.println("Jaylen ordered a" + taco + "\n");

        taco = Footlong.orderTaco("BBQ");
        System.out.println("Jaylen ordered a" + taco + "\n");

        taco = Footlong.orderTaco("chicken");
        System.out.println("Jaylen ordered a" + taco + "\n");

        taco = Footlong.orderTaco("meatball");
        System.out.println("Jaylen ordered a" + taco + "\n");

        taco = SixInch.orderTaco("bacon");
        System.out.println("Jaylen ordered a" + taco + "\n");

        taco = SixInch.orderTaco("BBQ");
        System.out.println("Jaylen ordered a" + taco + "\n");

        taco = SixInch.orderTaco("chicken");
        System.out.println("Jaylen ordered a" + taco + "\n");

        taco = SixInch.orderTaco("meatball");
        System.out.println("Jaylen ordered a" + taco + "\n");

    }

}