public class CoffeeShop {
    public static void main(String[] args) {
        Beverage kawa1 = new Espresso("GuT");
        System.out.println(kawa1.getDescription() + ' ' + kawa1.cost());

        kawa1 = new Milk(kawa1);
        System.out.println(kawa1.getDescription() + ' ' + kawa1.cost());
        kawa1 = new Milk(kawa1);
        System.out.println(kawa1.getDescription() + ' ' + kawa1.cost());
        kawa1 = new Milk(kawa1);
        System.out.println(kawa1.getDescription() + ' ' + kawa1.cost());
    }

}
