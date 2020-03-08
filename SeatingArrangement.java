import java.util.Scanner;

public class SeatingArrangement{
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=scan.nextInt();
            int r6=n%6;
            String seat;

            if(r6==0 || r6==1)
                seat="WS";
            else if(r6==2 || r6==5)
                seat="MS";
            else
                seat="AS";

            int r12=n%12;
            if(r12==0)
                r12=12;
            int y;

            y=13-2*r12;
            int nextSeat=n+y;
            System.out.println(nextSeat+" "+seat);
        }
    }
}