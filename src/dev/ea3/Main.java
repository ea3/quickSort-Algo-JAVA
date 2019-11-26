package dev.ea3;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int [] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Unsorted Array: "+ Arrays.toString(intArray));

        quickSort(intArray, 0, intArray.length);
        System.out.println("Sorted Array: "+ Arrays.toString(intArray));
        }

    public static void quickSort(int [] input, int start, int end){

        if(end - start < 2){
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);

    }

    public static int partition (int [] input, int start, int end){
        //Setting  the first element as pivot.
        int pivot = input[start];
        int i = start;
        int j = end;

        while( i < j){
            //note: empty loop.

            while(i < j && input[--j] >= pivot);
            if(i < j){
                input[i] = input[j];
            }

            //note: empty loop.

            while(i < j && input[++i] <= pivot);
            if(i < j){
                input[j] = input[i];
            }

        }

        input[j] = pivot;
        return j;

    }
}
