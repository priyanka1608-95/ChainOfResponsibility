import java.util.Arrays;

public class OneDimentionProcessor implements Chain
{
    private Chain nextInChain;

    @Override
    public void setNext(Chain next) {
        this.nextInChain=next;
    }

    @Override
    public void process(Dimension request)
    {
        if(request.getCoordinate().length==1)
        {
            System.out.println("One Dimention :"+ Arrays.toString(request.getCoordinate()));
        }
        else {
            nextInChain.process(request);
        }
    }
}
