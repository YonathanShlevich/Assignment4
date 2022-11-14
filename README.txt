Koushik Ramakrishnan, Yonathan Shlevich


Compilation:
Compile this program with:
javac -cp bin -d bin SortDriver.java
javac -cp bin -d bin Sorter.java

Run this program with:
java -cp bin Sorter.java [file]

IMPLEMENTATION:

Selection sort: For the selection sort, we would essentially finding the smallest element and moving it to the front. This would create a sorted subarray and an unsorted subarray.
Source: Code from slides
TIME COMPLEXITY: O(n^2)

Merge Sort: We used the Divide and Conquer method to create our merge sort. This splits the array into 2, and the 2 subarrays are sorted. We used recursion to split each subarray into 2 until the base case was reached.
Source: Code from slides
TIME COMPLEXITY: O(nlog(n))

Heap Sort: We used the ReHeapDown for trees for this algorithm. This would create a heap structure from the theoretical binary tree created in the array, and sorted the array with the maximum element.
Source: Code from slides

Quick Sort - First Pivot: We used the Divide and Conquer method for quicksort as well. However, instead of divinding the element in half like we did for merge sort, we created an array around the pivot element, which in this case was the first element.
TIME COMPLEXITY: O(nlog(n))
Quick Sort - Random Pivot: We used the Divide and Conquer method for the random pivot version of quicksort as well. However, instead of divinding the element in half like we did for merge sort or creating an array around the first element, we created an array around a random element.
TIME COMPLEXITY: O(nlog(n))
