import java.util.Scanner;
class TestClass {
        public static void main(String args[]) throws Exception {
                Scanner scan = new Scanner(System.in);
                System.out.print("testCase= ");
                int t = scan.nextInt();
                for(int x = 0;x<t; x++){
                        System.out.print("s1: ");
                String a = scan.next();
                        System.out.print("s2: ");
                String b = scan.next();
                char aa[] = a.toCharArray();
                char bb[] = b.toCharArray();
                int a1 = a.length();
                int b1 = b.length();
                int i = 0, j = 0, count = 0;
                for (i = 0; i < a1; i++) {
                        for (j = 0; j < b1; j++) {
                                if (aa[i] == bb[j]) {
                                        count++;
                                        bb[j]='0';
                                        break;
                                }

                        }
                }
                        System.out.println(a1);
                        System.out.println(b1);
                        System.out.println(a1+b1-2*count);
                }

                }
}
