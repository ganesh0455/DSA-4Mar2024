/* Time Complexity, let array size is N
 *  Worst case: O(N^2)
 *  Best Case: O(N)
 * 
 *Space Complexity: O(1)
 */

class InsertionSort {
    public static int[] insertion_sort(int[] array){
        int array_size = array.length;

        for(int i=1; i<array_size; i++){
            int key = array[i];
            int index_to_start_compare = i-1;
            int j = index_to_start_compare;
            for(; j>=0 && array[j]>key; j--){
                array[j+1]=array[j];
            }
            array[j+1]=key;
        }

        return array;
    }
    public static void main (String[] args){
        int[] array = {5,4,3,2,1};
        
        int[] result = insertion_sort(array);

        for(int element : result) {
            System.err.print(element + " ");
        }
        System.err.println();

        int[] array1 = {13,46,24,52,20,9};
        
        int[] result1 = insertion_sort(array1);

        for(int element : result1) {
            System.err.print(element + " ");
        }
        System.err.println();
    }
}
