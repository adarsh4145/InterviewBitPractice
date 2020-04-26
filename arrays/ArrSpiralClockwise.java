import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArrSpiralClockwise {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        int rows = A.size();
        int cols = A.get(0).size();
        //System.out.println(rows+" "+cols);
        int top = 0;
        int bottom = rows-1;
        int left = 0;
        int right = cols-1;
        
        int dir = 0;//0: left->right | 1: top->bottom | 2: right->left | 3: bottom->up
        ArrayList<Integer> res= new ArrayList<>();
        
        while(top<=bottom && left <= right){
            if(dir==0){
                for(int i=left;i<=right;i++){
                    res.add(A.get(top).get(i));
                }
                top++;
                dir = 1;
            }else if(dir==1){
                for(int i=top;i<=bottom;i++){
                    res.add(A.get(i).get(right));
                }
                right--;
                dir=2;
            }else if(dir==2){
                for(int i=right;i>=left;i--){
                    res.add(A.get(bottom).get(i));
                }
                bottom--;
                dir=3;
            }else {
                for(int i=bottom;i>=top;i--){
                    res.add(A.get(i).get(left));
                }
                left++;
                dir=0;
            }
        }
        return res;
    }
	
	public static void main(String[] args){
		List <ArrayList<Integer>> A= new ArrayList<ArrayList<Integer>>();
		A.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4)));
		A.add(new ArrayList<Integer>(Arrays.asList(5,6,7,8)));
		A.add(new ArrayList<Integer>(Arrays.asList(9,10,11,12)));
		A.add(new ArrayList<Integer>(Arrays.asList(13,14,15,16)));
		List <Integer> res = spiralOrder(A);
		res.forEach(i->{
			System.out.print(i+" ");
		});
	}
}