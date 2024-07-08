package basic.array;
import java.util.Scanner;
public class search {
    public static void main(String[]args)
    {
        String[] Actress={"sam","tri","rash","rashi"};
        Scanner scan=new Scanner(System.in);
        System.out.println(Actress.length);
        System.out.println(" Tell us what is your favourite actress");
        String favor=scan.next();
        for(int pos=0;pos<Actress.length;pos++)
        {
            if(favor.equalsIgnoreCase(Actress[pos]));
            {
                System.out.println(favor + "\nthis actress is found");
            }
        }


    }
}

