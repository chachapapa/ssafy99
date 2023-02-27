package test02;

public class Test1 {
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,6};
		
		for(int i = 0; i<nums.length ; i++) {
			System.out.println(nums[i]);
		}
		
		
		for(int i = nums.length-1 ; i>=0 ; i--) {
			System.out.println(nums[i]);
		}
		
		for(int num : nums) {
			System.out.println(num);
		}
		//이건 역방향순회 안됨.
		
	}
}
