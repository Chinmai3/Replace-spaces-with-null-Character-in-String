import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<String>();
        while(!(sc.hasNextInt()))
        {
            al.add(sc.nextLine());
        }
        int len=al.size();
        // inputString. replaceAll(“\\s”, “”).
        //for replacing the spaces with ntg.
        int i=0;
        while(i<len)
        {
            String s=(String)(al.get(i));
            s=s.replaceAll("\\s","");
            i++;
            System.out.println(s);
            
        }
    }
}
