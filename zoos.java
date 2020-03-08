import java.util.Scanner;
public class zoos {
    public static void main(String args[] ) {
    Scanner scan = new Scanner(System.in);
    String zoo = scan.nextLine();

    char ch[] = zoo.toCharArray();
        int x=0;
        int y=0;
        int i=0;
        int len = zoo.length();
        while(i<len){
            if(ch[i]=='z'){
                x++;
            }else if(ch[i] == 'o'){
                y++;
            }
            i++;
        }
        if(y==2*x){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
}
}
