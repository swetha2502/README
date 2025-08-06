package leetcode;

public class Leetcode0977 {

	public static void main(String[] args) {
		// Sorting the squared array using 2-way approach
		        int[] nums = {-4, -1, 0, 3, 10};  

		        int n = nums.length;
		        int[] result = new int[n];
		        int i = 0;         
		        int j = n - 1;     
		        int k = n - 1;     
		        while (i <= j) {
		            int leftSquare = nums[i] * nums[i];
		            int rightSquare = nums[j] * nums[j];
		            if (leftSquare > rightSquare) {
		                result[k] = leftSquare;
		                i++;
		            } else {
		                result[k] = rightSquare;
		                j--;
		            }
		            k--;
		        }
		        System.out.println("The resultant array after performing squaring and sorting operations is: ");
		        for (int m = 0; m < n; m++) 
		            System.out.print(result[m]+" ");
		       
		    }
		}

		   



