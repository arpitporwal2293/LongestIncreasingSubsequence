//this is a dynamic programming problem
public class LongestIncreasingSubsequence {

	public  static int getLongestSubSequence(int[] arr){
		int[] dpArr = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			dpArr[i] = 1;
		}
		
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<i;j++){
				if(arr[i]>arr[j] && dpArr[i]<dpArr[j]+1){
					dpArr[i] = dpArr[j]+1;
				}
			}
		}
		
		return dpArr[arr.length-1];
	}

	public static void main(String[] args) {
		int[] arr = {10,22,9,33,21,50,41,60};
		System.out.println(getLongestSubSequence(arr));
	}
	
}
