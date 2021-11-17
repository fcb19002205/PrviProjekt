package six.beverage;

public class Coffee extends Beverage {

    public Coffee() {
        super("Kava");
    }

    @Override
    public double cost() {
        return 1.5;
    }

    @Override
    public void drink() {
        System.out.println("Super kava");

    }
}
