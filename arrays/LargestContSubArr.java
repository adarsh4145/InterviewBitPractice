import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class LargestContSubArr{
	static int maxSubArray(final List<Integer> A) {
        
		int maxSum = Integer.MIN_VALUE;
        int currMaxSum = 0;
		int maxStart=0,maxEnd=0,currentStart = 0;
		
        for(int i=0;i<A.size();i++){
            int sumNow = currMaxSum+A.get(i);
            if(sumNow>A.get(i)){
                currMaxSum = sumNow;
            }
            else{
                currMaxSum  = A.get(i);
				currentStart=i;
            }
            if(currMaxSum>maxSum){
                maxSum = currMaxSum;
				maxStart = currentStart;
				maxEnd = i;
            }
        }
		System.out.println("start index: "+maxStart+" | end index: "+maxEnd);		
        return maxSum;
    }
	
	public static void main(String[] args){
		List<Integer> ar  = new ArrayList<>(Arrays.asList(-2,-3,1,-2,4,-2,1,5,-3));
		ar.forEach(a->{System.out.print(a+"\t");});System.out.println();
		int sum = maxSubArray(ar);
		System.out.println("max sum: "+sum);
	}
}
/*
The algorithm iterates over all the elements of the array (nums)
and computes the maximum sum ending at every index (maxEndingHere).
Here is how maxEndingHere is calculated:
-Initialize maxEndingHere to nums[0]
-Iterate through the array (1..n). For every iteration:
-If maxEndingHere + nums[i] < nums[i], 
	>that means the previous max was negative
		and therefore we reset maxEndingHere to nums[i].
	>Otherwise, we set maxEndingHere = maxEndingHere + nums[i]
-We also keep a variable maxSoFar which indicates the maximum sum found so far.
	And, with every iteration, we check if the current max (maxEndingHere) is greater than maxSoFar.
	>If yes, then we update the value of maxSoFar.
*/