public class Observer3 extends Observer
{
    Observer3(Subject subject)
    {
        this.subject =subject;
        this.subject.attach(this);
    }


    @Override
    public void update()
    {
        System.out.println("Observer 3 : "+subject.getState());
    }
}
