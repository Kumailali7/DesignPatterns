public abstract class OrderProcessTemplate
{
    public boolean isGift;
    public abstract void doSelect();
    public abstract void doPayment();
    public final void giftWrap()
    {
        System.out.println("Gift Wrap Successful!");
    }
    public abstract void doDelivery();
    public final void processOrder(boolean isGift)
    {
        doSelect();
        doPayment();
        if(isGift)
        {
            giftWrap();
        }
        doDelivery();
    }
}
