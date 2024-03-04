class SelectionSort {
    public static int[] selectionSort(int[] array){
        int array_size = array.length;
        for(int i = 0; i < array_size - 1; i++){
            int minimum_element_index = i;
            for(int j = i+1; j < array_size ; j++){
                if(array[j] < array[minimum_element_index]){
                    minimum_element_index = j;
                }
            }
            int temp = array[i];
            array[i] = array[minimum_element_index];
            array[minimum_element_index] = temp;
        }

        return array;
    }
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        
        int[] result = selectionSort(array);

        for(int element : result) {
            System.err.print(element + " ");
        }
        System.err.println();

        int[] array1 = {13,46,24,52,20,9};
        
        int[] result1 = selectionSort(array1);

        for(int element : result1) {
            System.err.print(element + " ");
        }
        System.err.println();
    }
}