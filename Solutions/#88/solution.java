class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int[] temp = new int[m+n];
		
		int index1 = 0;
		int index2 = 0;
		int i=0;
		while(index1<m && index2<n) {
			if(nums1[index1]<nums2[index2]) {
				temp[i] = nums1[index1];
				index1++;
			}
			else {
				temp[i] = nums2[index2];
				index2++;
			}
			i++;
		}//while
		
		
		while(index1<m) {
			temp[i] = nums1[index1];
			index1++;
			i++;
		}
		
		while(index2<n) {
			temp[i] = nums2[index2];
			index2++;
			i++;
		}

		for(int j=0;j<temp.length;j++){
			nums1[j]=temp[j];
		}

    }
}