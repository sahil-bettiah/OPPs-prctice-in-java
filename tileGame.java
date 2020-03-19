import java.util.Scanner;
class createArray{
    createArray(int arr[][], int size){
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                int n = scan.nextInt();
                if(n>=0 && n<16){
                    arr[i][j] = n;
                }
                else{
                    j--;
                }
            }
        }
    }
}
class detectEmptySpace{
    int detectEmptySlot(int arr[][], int n){
        for(int i=0; i<n; i++){
            int j=0;
            if(arr[i][j]!= 0){
                j++;
            }
            else{
                int k = 4*i + j+1;
                System.out.println(k +" slot is empty");
                return (k);

            }
        }
        return 0;

    }
}
class printNeighbour extends detectEmptySpace
{
    void NeighbourFinding(int a, int b){
        super.a = i;
        super.b = j;
        if(j== 0 && (i!=0 || i != n-1)){
            System.out.println("Neighbours of empty slot are"+ 4*i+(j+2) +","+ 4*(i-1)+j+1 +","+ 4*(i+1)+j+1);
        }
        else if(j==(n-1) && (i!= 0 || i!=(n-1)))
        {
            System.out.println("Neighbours of empty slot are"+ 4*i+(j) +","+ 4*(i-1)+j+1 +","+ 4*(i+1)+j+1);
        }
        else if(i==0 && (j!=0 || j!=(n-1)))
        {
            System.out.println("Neighbours of empty slot are"+ 4*i+(j) +","+ 4*(i)+j+2 +","+ 4*(i+1)+j+1);
        }
        else if(i==n-1 && (j!=0 && j!=n-1)){
            System.out.println("Neighbours of empty slot are"+ 4*i+(j) +","+ 4*(i-1)+j+1 +","+ 4*(i)+j+2);
        }
        else if(i== 0 && j == 0){
            System.out.println("Neighbout of empty slot are"+ i+j+2 +","+ 4*(i+1)+j+1);
        }
        else if(i== 0 && j == n-1){
            System.out.println("Neighbout of empty slot are"+ i+j +","+ 4*(i+1)+j+1);
        }
        else if(i== n-1 && j == 0){
            System.out.println("Neighbout of empty slot are"+ 4*i+j+2 +","+ 4*(i-1)+j+1);
        }
        else if(i== 0 && j == n-1){
            System.out.println("Neighbout of empty slot are"+ 4*i+j +","+ 4*(i-1)+j+1);
        }
        else if(i!= 0 || i != n-1 || j!=0 || j!= n-1){
            System.out.println("Neighbours of empty slot are"+ 4*i+(j+1) +","+ 4*(i)+j +","+ 4*(i)+j+2 +","+ 4*(i+1)+j+1);
        }

    }

}

public class tileGame {
    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[][] = new int[size][size];
        createArray c = new createArray(arr, size);
        detectEmptySpace d = new detectEmptySpace();
        int key = d.detectEmptySlot(arr, size);
        int pos = scan.nextInt();
        int i, j, k, l;
        if(pos%size==0){
            i = pos/size - 1;
            j = size - 1;
        }
        else {
            i = pos/size;
            j = pos%size - 1;
        }

        if(key%size==0){
            k = key/size - 1;
            l = size - 1;
        }
        else {
            k = key/size;
            l = key%size - 1;
        }
        int t;
        t = arr[i][j];
        arr[i][j] = arr[k][l];
        arr[k][l] = t;
        for (int x=0; x<size; x++){
            for(int y=0; y<size; y++){
                System.out.print(arr[x][y] +" ");
            }
            System.out.println();
        }
    }
}










