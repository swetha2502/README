package leetcode;

public class Leetcode540 {

	public static void main(String[] args) {
		//Single element in an array for O(n) time-complexity 
		        int[] nums1 = {1,1,2,3,3,4,4,8,8};
		        int[] nums2 = {3,3,7,7,10,11,11};
		        // binary search on nums1
		        int low = 0, high = nums1.length - 1;
		        while (low < high) {
		            int mid = low + (high - low) / 2;
		            if (nums1[mid] == nums1[mid + 1]) {
		            	low = mid + 2;
		            } else {
		            	high = mid;
		            }
		        }
		        System.out.println("Binary search result for nums1: " + nums1[low]);
		        // binary search on nums2
		        int loww = 0, highh = nums2.length - 1;
		        while (loww < highh) {
		            int mid = loww + (highh - loww) / 2;
		            if (nums2[mid] == nums2[mid + 1]) {
		            	low = mid + 2;
		            } else {
		            	highh = mid;
		            }
		        }
		        System.out.println("Binary search result for nums2: " + nums2[loww]);
		    }
		}

