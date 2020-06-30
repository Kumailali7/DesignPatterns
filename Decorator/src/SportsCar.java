public class SportsCar extends CarDecorator
{
    public SportsCar(Car c)
    {
        super(c);
    }

    @Override
    public void assemble()
    {
        System.out.println("Adding Features of Sports Car.");
        super.assemble();
    }
}
