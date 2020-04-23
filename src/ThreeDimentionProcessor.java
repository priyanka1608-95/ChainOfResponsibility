import java.util.Arrays;

public class ThreeDimentionProcessor implements Chain
{
    private Chain nextInChain;

    @Override
    public void setNext(Chain next) {
        this.nextInChain=next;
    }

    @Override
    public void process(Dimension request)
    {
        if (request.getCoordinate().length == 3) {
            System.out.println("Three Dimention :" + Arrays.toString(request.getCoordinate()));
        }
        else
            System.out.println("invalid request");
    }
}
