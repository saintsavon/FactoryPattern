public class TestTaco {

    public static void main(String[] args) {
        
        TacoStand streetTaco = new StreetTaco();
        TacoStand americanTaco = new AmericanTaco();

        Taco taco = streetTaco.orderTaco("goat");
        System.out.println("Jaylen ordered a" + taco + "\n");

        taco = americanTaco.orderTaco("chicken");
        System.out.println("Jaylen ordered a" + taco + "\n");

    }

}