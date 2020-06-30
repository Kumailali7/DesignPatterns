public class Main
{
    public static void main(String[] args)
    {
        Subject subject = new Subject();
        new Observer1(subject);
        new Observer2(subject);
        new Observer3(subject);

        System.out.println("First State changes : "+15);
        subject.setState(15);

        System.out.println("Second State changes : "+10);
        subject.setState(10);
    }

}