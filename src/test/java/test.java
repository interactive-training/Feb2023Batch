import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

    @Test
    public void reverseSentenceWithoutWordsReversed(){

        String a = ("Pramod Kumar Mallick is going to home");

        //form to array
        String[] ar = a.split(" ");
        System.out.println(ar.length);
        System.out.println(Arrays.toString(ar));

        List l = Arrays.asList(ar);
        System.out.println(l);
        System.out.println(l.hashCode());

//        l.add("NewValueAddedToList");

        ArrayList<String> c = new ArrayList(Arrays.asList(ar));

        System.out.println(c);

    }


    @Test
    public void verifyStringLiterails(){
        String a = "hello";
        String b = "hello";

//        System.out.println(a==b);

        a = "hello1";
        System.out.println(b);
    }


    @Test
    public void reverseNumber(){

        StringBuilder sb  = new StringBuilder("Pramod Kumar Mallick");
        System.out.println(sb);
        System.out.println(sb.reverse());

        sb.toString().split(" ");


    }

    @Test
   public void swapvalue() {

//        int x = 5;
//        int y = 6;
//
//        System.out.println("x is : " + x);
//        System.out.println("y is : " + y);
//
//        x = 5 + y; //11
//        y = x - y;  // 11- 6 = 5
//        x = x - y; // 11 - 5 = 6
//
//        System.out.println(" x is : " + x);
//        System.out.println(" y is : " + y);


        //strings

        String x = "a";
        String y = "b";

        System.out.println("x values is : " + x);
        System.out.println("y values is : " + y);

        x = x + " " + y;
        System.out.println( x);


    }
}
