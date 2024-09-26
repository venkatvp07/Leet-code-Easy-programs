public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] out = new int[m+n];
        int i  = 0 , j = 0 , k = 0;
        
        while(m != i || n != j) {
        	if(m!=i && n != j) {
        		if(nums1[i] >= nums2[j]) {
        			out[k++] = nums2[j++];
        		}else {
        			out[k++] = nums1[i++];
        		}
        	}else if(m == i) {
        		out[k++] = nums2[j++];
        	}else {
        		out[k++] = nums1[i++];
        	}
        }
    	
        for(int asd=0;asd<nums1.length;asd++) {
        	nums1[asd] = out[asd];
        }
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m = 3;
		int n = 3;
		merge(nums1,m,nums2,n);
	}

}
