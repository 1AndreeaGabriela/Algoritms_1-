package poo1;

public class Fibonacci

{  public static int fibo_r (int n)
{
    if(n<2) return n;
    else return fibo_r(n-1)+fibo_r(n-2);

}


public static int fibo_i(int n){

    int i=0;
    int j=1;
    int s=1;

    for(int k=1;k<=n;k++)
    {
        i=j;
        j=s;
        s=i+j;

    }
    return i;
}
}
