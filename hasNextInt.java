import java.util.Scanner;
import java.math.BigInteger;
class hasNextInt {
    public static void main(String args[] ) throws Exception {

        Scanner scan = new Scanner(System.in);
        while(scan.hasNextBigInteger()){
            BigInteger a = scan.nextBigInteger();
            BigInteger b = scan.nextBigInteger();
            BigInteger sum = a.add(b);
            System.out.println(sum);
        }

    }
    //14921950424743840134208566968420821009689739
    //22222222222222222222222222222222222222222222

}


