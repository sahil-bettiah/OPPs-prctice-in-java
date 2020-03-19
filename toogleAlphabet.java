import java.util.Scanner;
class toogle{
    toogle(char alph[]){
        int len = alph.length;
        for(int i=0; i<len; i++){
            if(alph[i]>= 'a' && alph[i]<='z'){
                alph[i] = (char)(alph[i] + 'A'-'a');
            }
            else if(alph[i] >= 'A' && alph[i]<='Z'){
                alph[i] = (char)(alph[i] + 'a'-'A');
            }
        }
    }
}
class print{
    print(char alph[]){
        int len = alph.length;
        for(int i=0; i<len; i++){
            System.out.print(alph[i]);
        }
    }
}
class toogleAlphabet {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        char alph[] = S.toCharArray();
        toogle a = new toogle(alph);
        print p = new print(alph);

    }
}


