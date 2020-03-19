import java.util.Scanner;
class Stack {
    int[]  addElements(int arr[], int size, int data, int index){
        if(index < size){
            arr[index] = data;
            return arr;

        }else{
            int newSize = 2*size;
            int newArr[] = new int[newSize];
            int i=0;
            for(i=0; i< size; i++){
                newArr[i] = arr[i];
            }
            newArr[i] = data;
            return newArr;
        }
    }
    int search(int arr[], int data){
        int pos;
        int i=0;
        int size = arr.length;
        while(i<size){
            if(arr[i]!= data){
                i++;
            }
            else return i;
        }
        return -1;
    }
    void removeElements(int arr[], int size, int data1){
        int t= search(arr, data1);
        if(t>=0){
            int i = t;
            while (size-1>i){
                arr[i] = arr[i+1];
                i++;
            }
        }else
            System.out.println("data not found");

    }

}
class Queue{
    int[]  addElements(int arr[], int size, int data, int index){
        if(index < size){
            arr[index] = data;
            return arr;

        }else{
            int newSize = 2*size;
            int newArr[] = new int[newSize];
            int i=0;
            for(i=0; i< size; i++){
                newArr[i] = arr[i];
            }
            newArr[i] = data;
            return newArr;
        }
    }
//    int search(int arr[], int data){
//        int pos;
//        int i=0;
//        int size = arr.length;
//        while(i<size){
//            if(arr[i]!= data){
//                i++;
//            }
//            else return i;
//        }
//        return -1;
//    }
    int[] removeElementsfromQueue(int arr[], int size){
        arr[size] = -1;
        size = size -1;
        return arr;

    }

}
public class linkedList{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int [size];
//        int newSize = 2*size;
//        int newArr[] = new int [newSize];
        Stack stk = new Stack();
        int i=0;
        String s =null;
        for(i= 0; s!="stop"; i++){
            int data = scan.nextInt();
            arr = stk.addElements(arr, size, data, i);
            s = scan.nextLine();
        }

        int data1 = scan.nextInt();
        stk.removeElements(arr, size, data1);
        Queue Q = new Queue();
        for(i= 0; s!="stop"; i++){
            int data = scan.nextInt();
            arr = Q.addElements(arr, size, data, i);
            s = scan.nextLine();
        }
        Q.removeElementsfromQueue(arr, size);

    }
}
