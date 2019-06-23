//HashMap
// .toCharArray()
import java.util.HashMap;


public class JewelAndStones {
	
	
    public static int numJewelsInStones(String J, String S) {
        
        int answer = 0;
		
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		
		char[] StoCharArray = S.toCharArray();
		
		for(int i=0; i<StoCharArray.length; i++)
		{
			if(!map.containsKey(StoCharArray[i]))
			{
				map.put(StoCharArray[i], 1);
			}
			else {
				int temp = map.get(StoCharArray[i])+1;
				map.put(StoCharArray[i], temp);
			}
		}
		
		char[] JtoCharArray = J.toCharArray();

		for(int i=0; i<J.length();i++) {
            if(map.containsKey(JtoCharArray[i]))
			    answer+=map.get(JtoCharArray[i]);
            }
		  return answer;      
    }
	
	
	public static void main(String args[]) {
		
		String j =  "aA";
		
		String s = "aAAbbbb";
		
		System.out.println(numJewelsInStones(j,s));
		

	}

}
