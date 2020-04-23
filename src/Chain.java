public interface Chain
{
     void setNext(Chain nextInChain);
     void process(Dimension request);
}
