package six.beverage;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Main.consumerBeverage(coffee);
        Tea tea = new Tea();
        Main.consumerBeverage(tea);
        CocaCola cocaCola = new CocaCola();
        Main.consumerBeverage(cocaCola);



//        BeverageConsumer beverageConsumer = new BeverageConsumer(coffee);
//        beverageConsumer.consume();
//
//        beverageConsumer.setBeverage(tea);
//        beverageConsumer.consume();
//
//        beverageConsumer.setBeverage(cocaCola);
//        beverageConsumer.consume();

    }
    public static void consumerBeverage (Beverage beverage){
        System.out.println("Pijem " + beverage.getName() + " i to me košta " + beverage.cost());
    }

}
