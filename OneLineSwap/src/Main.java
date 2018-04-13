
public class Main {

	public static void main(String[] args) {
		int[] n = {0, 5};
		
		System.out.println("Pre-Swap\nx: " + n[0] + ", y: " + n[1]);
		swap(n);
		System.out.println("Post-Swap\nx: " + n[0] + ", y: " + n[1]);
	}
	
	public static void swap(int[] nums) {
		nums[0] = nums[0] ^ nums[1]; // x now becomes 15 (1111)
		nums[1] = nums[0] ^ nums[1]; // y becomes 10 (1010)
		nums[0] = nums[0] ^ nums[1]; // x becomes 5 (0101)
	}
	
	

}
