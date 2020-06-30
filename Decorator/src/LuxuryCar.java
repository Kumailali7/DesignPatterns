public class LuxuryCar extends CarDecorator
{
    public LuxuryCar(Car c)
    {
        super(c);
    }

    @Override
    public void assemble()
    {
        System.out.println("Adding Features of Luxury Car.");
        super.assemble();
    }
}
