Koushik Ramakrishnan, Yonathan Shlevich


Compilation:
Compile this program with:
javac -cp bin -d bin SortDriver.java
javac -cp bin -d bin Sorter.java

Run this program with:
java -cp bin Sorter.java [file]

IMPLEMENTATION:

Selection sort: For the selection sort, we would essentially finding the smallest element and moving it to the front. This would create a sorted subarray and an unsorted subarray.
TIME COMPLEXITY: O(n^2)

Merge Sort: We used the Divide and Conquer method to create our merge sort. This splits the array into 2, and the 2 subarrays are sorted. We used recursion to split each subarray into 2 until the base case was reached.
TIME COMPLEXITY: O(nlog(n))

Heap Sort: We used the ReHeapDown for trees for this algorithm. This would create a he
