public class Sorter {

    long counter = 0;

    public void getCounter(){
        System.out.print(counter);
    }

    //Selection Sort
    public void selectionSort(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            int min = i;
            //counter++;
            for(int j = i + 1; j < nums.length; j++){
                counter++;
                if(nums[j] < nums[min]){
                    min = j;
                }
                int temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
            }
        }
        //System.out.println(counter);
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
        for(int j = mid; j < size; j++){
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
            counter++;
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
        counter++;
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    //Heap Sort
    public void heapSort(int[] nums, int numValues){
        int index;
        
        for (index = numValues/2 - 1; index >= 0; index--){
            counter++;
            ReheapDown(nums, index ,numValues - 1);
        }
        for (index = numValues - 1; index >= 1; index--){
            counter++;
            swap(nums, nums [0] , nums[index]);
            counter++;
            ReheapDown(nums, 0, index - 1);
        }
    }

    //Helper Heap Sort
    void ReheapDown(int[] nums, int root, int bottom){
        counter++;
        int maxChild;
        int rightChild;
        int leftChild;
        maxChild = bottom; //Added
        leftChild = bottom * 2 + 1 ; //From root->bottom
        rightChild = bottom * 2 + 2 ; //From root->bottom
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
                counter++;
                swap(nums, nums[root], nums[maxChild]);
                counter++;
                ReheapDown(nums, maxChild, bottom);
            }
        }

    }

    //Quicksort 
    public void quickSort(int[] nums, int first, int last){
        if ( first < last ){
            int divide = split(nums, first, last);
            counter++;
            quickSort(nums, first, divide - 1);
            counter++;
            quickSort(nums, divide + 1, last);
            }
    } 
    private int split(int[] nums, int first, int last){
        long pivot = nums[last];
        int i = (first - 1);
        for(int j = first; j < last; j++){
            counter++;
            if(nums[j] <= pivot){
                i++;

                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, last);
        return i + 1;
    } 
    
}