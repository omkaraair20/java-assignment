import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class demo {

	public static void main(String[] args) {
		 List<Integer> nums = Arrays.asList(6,4,2,8,10);
		 
		 int result = nums.parallelStream()
				 .filter(n -> n%2==1)
				 .map(n -> n*2)
				 .reduce(0,(c,e) -> c+e);
		 
		 System.out.println(result);
		 
		 
		//for(int n:nums)
       // {
		//	System.out.println(n*2);
		//}
	}

}
