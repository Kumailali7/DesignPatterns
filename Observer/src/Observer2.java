public class Observer2 extends Observer
{
    Observer2(Subject subject)
    {
        this.subject =subject;
        this.subject.attach(this);
    }


    @Override
    public void update()
    {
        System.out.println("Observer 2 : "+subject.getState());
    }
}
