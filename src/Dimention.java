public class Dimention
{
    private int[] coordinate;
    Dimention()
    {
        this.coordinate=null;
    }

    Dimention(int x)
    {
        this.coordinate=new int[] {x};
    }

    Dimention(int x,int y)
    {
        this.coordinate=new int[] {x,y};
    }

    Dimention(int x,int y,int z)
    {
        this.coordinate=new int[] {x,y,z};
    }

    public int[] getCoordinate() {
        return coordinate;
    }
}
