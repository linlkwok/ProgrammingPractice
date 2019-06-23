//HashMap
import java.util.HashMap;

public class TwoSum {
	
	
	public static int[] solution(int[] nums, int target) {
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0; i<nums.length; i++) {
			map.put(nums[i], i);
			
		}
		for(int i=0; i<nums.length; i++) {
			int complement = target-nums[i];
			
			if(map.containsKey(complement) && map.get(complement)!=i) {
				return new int[] {i,map.get(complement)};
			}
		}
		
		return new int[] {-1,-1};
		
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {2,7,11,15};
		int[] ans = solution(nums,9);
		
		System.out.println("("+ans[0]+","+ans[1]+")");	
	}

}
