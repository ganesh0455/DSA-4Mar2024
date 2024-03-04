class BubbleSort {
    public static int[] bubbleSort(int[] array){
        int array_size = array.length;

        for(int i = array_size; i > 0; i--){
            for (int j = 0; j < i - 1; j++){  // if you keep j < i, then for the last index we will get Array Out of bounds exception.
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
    public static void main (String[] args){
        int[] array = {5,4,3,2,1};
        
        int[] result = bubbleSort(array);

        for(int element : result) {
            System.err.print(element + " ");
        }
        System.err.println();

        int[] array1 = {13,46,24,52,20,9};
        
        int[] result1 = bubbleSort(array1);

        for(int element : result1) {
            System.err.print(element + " ");
        }
        System.err.println();
    }
}
