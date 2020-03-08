import java.util.Scanner;
public class zoos {
    public static void main(String args[] ) throws Exception {
    Scanner scan = new Scanner(System.in);
    String zoo = scan.nextLine();

    char ch[] = zoo.toCharArray();
        int x=0;
        int y=0;
        int i=0;
        //while(zoo.char.At(i) == 'z'){
        while (ch[i] == 'z'){
        x += 1;
        i++;
    }
        if(x==0){
        System.out.print("NO");
    }
        else{
        //while(zoo.char.At(i) == 'o'){
            while (ch[i] == 'o'){
            y += 1;
            i++;
        }
    }
        if(y == 2*x){
        System.out.print("YES");
    }
        else {
            System.out.print("NO");
        }
}
}
