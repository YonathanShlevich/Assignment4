import java.util.Arrays;    

public class Sorter {

    long counter = 0;

    //Selection Sort
    public void selectionSort(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
                int temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
            }
        }
    }

    //Print method
    public void print(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
    
    //Merge sort
    public void mergeSort(int[] nums, int size){
        if(size < 2){
            return ;
        }
        int mid = size / 2;
        int[] one = new int[mid];
        int two[] = new int[size - mid];
        for(int i = 0; i < mid; i++){
            one[i] = nums[i];
        }
        for(int j = 0; j < size; j++){
            two[j - mid] = nums[j];
        }
        mergeSort(one, mid);
        mergeSort(two, size - mid);
        merge(nums, one, two, mid, size - mid);

    }
    public void merge(int[] nums, int[] l, int[] r, int lp, int rp){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < lp && j < rp){
            if(l[i] <= r[j]){
                nums[k++] = l[i++];
            }else{
                nums[k++] = r[j++];
            }
        }
        while(i < lp) {
        nums[k++] = l[i++];
        }
        while(j < rp){
            nums[k++] = r[j++];
        }
    }

    //Swap method, helper for multiple
    public void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    //Heap Sort
    public void heapSort(int[] nums, int numValues){
        int index;
        
        for (index = numValues/2 - 1; index >= 0; index--){
            ReheapDown(nums, index ,numValues - 1);
        }
        for (index = numValues - 1; index >= 1; index--){
            swap(nums, nums [0] , nums[index]);
            ReheapDown(nums, 0, index - 1);
        }
    }

    //Helper Heap Sort
    void ReheapDown(int[] nums, int root, int bottom){
        int maxChild;
        int rightChild;
        int leftChild;
        leftChild = root * 2 + 1 ;
        rightChild = root * 2 + 2 ;

        if (leftChild <= bottom){
            if (leftChild == bottom)
                maxChild = leftChild;
            else{
                if (nums[leftChild] <= nums [rightChild])
                    maxChild = rightChild ;
                else
                    maxChild = leftChild ;
            }
            if (nums[ root ] < nums[maxChild]){
                swap(nums, nums[root], nums[maxChild]);
                ReheapDown(nums, maxChild, bottom);
            }
        }

    }

    //Quicksort 
    public void quickSort(int[] nums, int first, int last){
        if ( first < last ){
            quickSort(nums, first, split(nums, first, last) - 1);
            quickSort(nums, split(nums, first, last) + 1, last);
            }
    } 
    private int split(int[] nums, int b, int e){
        int pivot = nums[e];
        int i = b --;

        for(int j = b; j < e; j++){
            if(nums[j] <= pivot){
                i++;

                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, e);
        return i + 1;
    } 
    
}
