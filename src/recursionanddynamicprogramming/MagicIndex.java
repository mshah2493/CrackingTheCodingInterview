package recursionanddynamicprogramming;

public class MagicIndex {
	public int getMagicIndex(int[] arr) {
		return getMagicIndex(arr, 0, arr.length - 1);
	}
	
	public int getMagicIndex(int[] arr, int start, int end) {
		int mid = start + (end - start) / 2;
		
		if (arr[mid] == mid) return mid;
		
		if (arr[mid] > mid) return getMagicIndex(arr, 0 , mid - 1);
		
		return getMagicIndex(arr, mid + 1, end);
	}
}
