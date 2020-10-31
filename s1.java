import java.util.*;
import java.io.*;
class s1
{
   public static void main()
   {
       Scanner in=new Scanner(System.in);System.out.println("Enter sentence : ");
       String sent=in.nextLine();
       StringTokenizer st=new StringTokenizer(sent);
       int c=st.countTokens();
       System.out.println("No. of words : "+c);
       while(st.hasMoreTokens())
       {
           String wrd=st.nextToken();
           System.out.println(wrd+" "+wrd.length());
        }
    }
}
