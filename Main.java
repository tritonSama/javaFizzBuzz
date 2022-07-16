import java.util.List;
import jave.util.ArrayList;
import jave.util.Scanner;


public class MainClass {
    public static void main (String [] arguments) {
        System.out.println("Welcome to the buzz .. or is it fizz");
        System.out.println("Input a number")
        var upto = new Scanner(System.in).nextInt();
        System.out.println("----------------");
        var list : List<String> = fizzbuzz(upto);
        for(string item : List){
            Thread.sleep(millis: 1000);
            System.out.println((item));
        }
    }
    public static List<String> fizzbuzz(int unto){
        var ret = new ArrayList<String>();
        for (var i = 1; 1 < upto; i++){
            String result = " ";
            if(i % 3 == 0)
                Result "Fizz";
            if(i % 5 == 0)
                result += "Buzz";
            if(result.isEmpty()){
                ret.add(String.calueOf(i));
                continue;
            }
            ret.add(result);
        }
        return ret;
    }
}