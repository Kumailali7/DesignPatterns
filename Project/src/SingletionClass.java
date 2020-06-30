public class SingletionClass
{
    private static SingletionClass ourInstance = new SingletionClass();

    public static SingletionClass getInstance()
    {
        return ourInstance;
    }

    private SingletionClass()
    {
        System.out.println("Singleton Class Object Created.");
    }
}
