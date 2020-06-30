public class StoreOrder extends OrderProcessTemplate
{
    @Override
    public void doSelect()
    {
        System.out.println("Item choosen from shelf.");
    }

    @Override
    public void doPayment()
    {
        System.out.println("Pays at counter.");
    }

    @Override
    public void doDelivery()
    {
        System.out.println("Item delivered to Counter.");
    }
}