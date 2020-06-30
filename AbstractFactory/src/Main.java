import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String str ="Kumail";

        char [] arr = new char[str.length()];
        int j=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            arr[i]=str.charAt(j);
            j++;
        }

        System.out.println(arr);
    }
}
