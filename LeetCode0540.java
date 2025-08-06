package leetcode;

public class LeetCode0540 {

	public static void main(String[] args) {
		//Single element in an array for O(log n) time-complexity 
		        int[] nums1 = {1,1,2,3,3,4,4,8,8};
		        int[] nums2 = {3,3,7,7,10,11,11};

		        int xorResult1 = 0;
		        for (int i = 0; i < nums1.length; i++) {
		            xorResult1 = xorResult1 ^ nums1[i];
		        }
		        System.out.println("XOR result for nums1: " + xorResult1);  

		        int xorResult2 = 0;
		        for (int i = 0; i < nums2.length; i++) {
		            xorResult2 = xorResult2 ^ nums2[i];
		        }
		        System.out.println("XOR result for nums2: " + xorResult2);  
		    }
		}

