package leetcode;

public class Leetcode977 {

	public static void main(String[] args) {
		// Sorting the squared array using binary Search
		int a, b;
		int[] nums1= {-4,-1,0,3,10};
		int[] nums2 = {-7,-3,2,3,11};
		for(int i=0; i<nums1.length; i++) {
			nums1[i]=(int)Math.pow(nums1[i], 2);
		}
		System.out.print("Unsorted array of nums1 is: ");
		for(int i=0; i<nums1.length; i++) {
			System.out.print(nums1[i]+" ");
		}
		System.out.println();
		for(int i=0; i<nums2.length; i++) {
			nums2[i]=(int)Math.pow(nums2[i], 2);
		}
		System.out.print("Unsorted array of nums2 is: ");
		for(int i=0; i<nums2.length; i++) {
			System.out.print(nums2[i]+" ");
		}
		System.out.println();
		for(int i=0; i<nums1.length-1; i++) {
			for(int j=0; j<nums1.length-1-i; j++) {
				if(nums1[j]>nums1[j+1]) {
					a=nums1[j];
					nums1[j]=nums1[j+1];
					nums1[j+1]=a;
				}
			}
		}
		System.out.print("Sorted array of nums1 is: ");
		for(int i=0; i<nums1.length; i++) {
			System.out.print(nums1[i]+" ");
		}
		System.out.println();
		for(int i=0; i<nums2.length-1; i++) {
			for(int j=0; j<nums2.length-1-i; j++) {
				if(nums2[j]>nums2[j+1]) {
					b=nums2[j];
					nums2[j]=nums2[j+1];
					nums2[j+1]=b;
				}
			}
		}
		System.out.print("Sorted array of nums2 is: ");
		for(int i=0; i<nums2.length; i++) {
			System.out.print(nums2[i]+" ");
		}
		System.out.println();
		
	}
}
