import java.util.*;

public class Reverse {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String user_str = inp.nextLine();
        int len = user_str.length()-1;
        char reverse[] = new char[len];
        for(int i=0;i<len-2;i++)
            reverse[len-1] = user_str.charAt(i);
        System.out.println("array after reversal is = " + reverse);
    }
}
