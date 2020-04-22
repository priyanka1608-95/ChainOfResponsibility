import java.util.Arrays;

public class TwoDimentionProcessor implements Chain
{
    private Chain nextInChain;

    @Override
    public void setNext(Chain next) {
        this.nextInChain=next;
    }

    @Override
    public void process(Dimention request)
    {
        if (request.getCoordinate().length == 2) {
                System.out.println("Two Dimention :" + Arrays.toString(request.getCoordinate()));
        }
        else
            nextInChain.process(request);
    }
}
