public class Client
{
    public static void main(String[] args)
    {

        Chain c1=new OneDimentionProcessor();
        Chain c2=new TwoDimentionProcessor();
        Chain c3=new ThreeDimentionProcessor();

        c1.setNext(c2);
        c2.setNext(c3);

        c1.process(new Dimention(5));
        c1.process(new Dimention(10,20));
        c1.process(new Dimention(50,60,70));


    }
}
