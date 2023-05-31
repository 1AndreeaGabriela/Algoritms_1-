package poo1;

public class Euclid
{
    public static int euclid(int m, int n)
    {
        while(n!=0)
        {
            int temp=n;
            n=m%n;
            m=temp;

        }

        return m;
    }





}
