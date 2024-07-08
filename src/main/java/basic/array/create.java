package basic.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class create {
    public static void main (String[]args)
    {
        int a[]={11,2,3,4,5,4,5,6,7,8,9};
        System.out.println(a.length);
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        for(int j:a)
        {
            System.out.println(Arrays.toString(a));
        }
    }
}
