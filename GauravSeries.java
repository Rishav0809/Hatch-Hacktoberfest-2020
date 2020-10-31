import java.util.*;
class Series
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 'a' in series");
        int a = in.nextInt();int f = 1;double s = 0.0;
        for(int i = 2;i<=5;i++)
        {
            f = 1;
            for(int j = 1;j<=i;j++)
            {
                f = f*j;
            }
            if(i%2==0)
            s = s+(double)(a/f);
            else
            s = s-(double)(a/f);
        }
        System.out.println(s);
    }
}
