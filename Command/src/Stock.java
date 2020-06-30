public class Stock
{
    public String name="ABC";
    private  int quantity =10;

    public void buy()
    {
        System.out.println("Stock Name : "+name+"\nQuantity :"+quantity +"\tBought.");
    }

    public void sell()
    {
        System.out.println("Stock Name : "+name+"\nQuantity :"+quantity +"\tSold.");
    }
}