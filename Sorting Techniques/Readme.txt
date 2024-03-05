Sorting : Given any sequence of numbers we have to order them in either ascending order or descending order.

Once possible way is may be we can find out all permutation of the sequence and we can take the the permutation which is in achending order.
But this is very time taking like for find out the permutations of a number it will take O(n!) i.e O(n power n), this is exponential, we have to avoid such algorithms.

For solving this there are bunch of sorting techniques to reduce the time complexities

----------------------------------------------------------------

Bubble sort: This technique works in such a way that the adjecent elements will be compared and swapped in this case the least element would go left,
like that for every iteration the gratest element would go to the last, here the array will get sorted from last index.

Worse case time: O(n power 2)
Best case : O(n)

----------------------------------------------------------------

Selection sort: In this technique for every iteration we will find the minimum element in remaining elements except the current and prev elements.
Once we found minimum element then we will swap that with the current alement.
Like that for the current element we will find the minimum element in remaining elements and swap that element with current element.

Worse case time: O(n power 2)
Best case : O(n power 2)

----------------------------------------------------------------

Insertion Sort: Here, for every element we will compare the all previsous elements if the immidiate lefft side element is smaller then we will stopp then and there and go to the next element.
Because all the elements to the left side for the current element will be already sorted.

Worst Case: O(n power 2)
Best Case : O(n)

----------------------------------------------------------------