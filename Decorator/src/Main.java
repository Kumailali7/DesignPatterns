public class Main
{
    public static void main(String[] args)
    {
        Car car = new BasicCar();
        car.assemble();
        System.out.println("\nSports Car");
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\nSports Luxury Car");
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }

}
