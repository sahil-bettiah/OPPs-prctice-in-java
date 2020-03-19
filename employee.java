import java.util.Scanner;

class sort{
    sort(int arr[][], int n){
        int i=0;
        for (i=0; i<n-1; i++){
            int minIndex = i;
            for (int j = i+1; j<n; j++){
                if(arr[j][8] > arr[minIndex][8])
                    minIndex = j;

            }
            for(int x = 0; x<9; x++){
                int temp = arr[minIndex][x];
                arr[minIndex][x] = arr[i][x];
                arr[i][x] = temp;
            }
        }

    }

}

public class employee {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of employees: ");
        int n = scan.nextInt();
        int arr[][] = new int[n][9];
        int i=0, j=0, sum = 0;
        for (i=0; i<n; i++){
            System.out.println("Now, Enter emp_id and their working hour in a day and at last total sum of working hour in a week");
            int emp_id = scan.nextInt();
            arr[i][0] = emp_id;
            sum = 0;
            for(j = 1; j<8; j++){
                int workHour = scan.nextInt();
                arr[i][j] = workHour;
                sum += arr[i][j];
            }
            arr[i][8] = sum;
        }
        sort s = new sort(arr, n);
        System.out.println("Now, we're going to print employees detail in decreasing order of total working hours.");
        for(i=0; i<n; i++){
            for(j=0; j<9; j++)
                System.out.print(arr[i][j] +" ");
            System.out.println("");
        }
    }
}
/*
1
        2
        3
        4
        2
        2
        3
        1

        2
        1
        3
        2
        1
        4
        2
        1

        3
        3
        4
        1
        1
        2
        3
        1
*/