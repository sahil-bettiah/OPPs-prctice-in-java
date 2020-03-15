import java.util.Scanner;
public class palindromicString {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string");
        String palString = scan.next();
        char palChar[] = palString.toCharArray();
        int palLen = palString.length();
        System.out.println(palLen);
        //aint j = palLen % 2;
       // System.out.println(j);
        int n = palLen / 2;;

        System.out.println(n);
        int i = 0;
        int j=palLen-1;
        while(i<=j && palChar[i++]==palChar[j--]);
        if(i>j) System.out.println("Yes");
        else System.out.println("No");

    }

}
