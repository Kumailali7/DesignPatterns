public class NetOrder extends OrderProcessTemplate
{

    @Override
    public void doSelect()
    {
        System.out.println("Item added to shopping cart.");
        System.out.println("Get gift wrap preference.");
        System.out.println("Get Delivery Address.");
    }

    @Override
    public void doPayment()
    {
        System.out.println("Online Payment.");
    }

    @Override
    public void doDelivery()
    {
        System.out.println("Item shipped to delivery address.");
    }
}