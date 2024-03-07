import java.util.*;

class Solution{
    private static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2 ;
        mergeSort(arr, low, mid);  // left half
        mergeSort(arr, mid + 1, high); // right half
        merge(arr, low, mid, high);  // merging sorted halves
    }

    public static void merge_sort(int[] array, int low, int high){
        if(low < high){
            int mid=(low+high)/2;
            merge_sort(array, low, mid);
            merge_sort(array, mid+1, high);
            merge(array,low,mid,high);
        }
    }
}

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        int array_size = array.length;
        
        Solution.merge_sort(array, 0, array_size-1);

        for(int element : array) {
            System.err.print(element + " ");
        }
        System.err.println();

        int[] array1 = {13,46,24,52,20,9};

        int array1_size = array1.length;
        
        Solution.merge_sort(array1, 0, array1_size-1);

        for(int element : array1) {
            System.err.print(element + " ");
        }
        System.err.println();
    }
}
