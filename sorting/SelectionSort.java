import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class SelectionSort{
	static List<Integer> selectionSort(List<Integer> arr){
		for(int i=0;i<arr.size()-2;i++){
			Integer minIndex = i;
			for(int j=i+1;j<arr.size()-1;j++){
				if(arr.get(j)<arr.get(minIndex)){
					minIndex = j;
				}
			}
			Integer temp = arr.get(i);
			arr.set(i,arr.get(minIndex));
			arr.set(minIndex, temp);
		}
		return arr;
	}
	public static void main(String[] args){
		List<Integer> arr = new ArrayList<>(Arrays.asList(8,4,2,5,9,1,0,6,3,7,2,9));
		arr.forEach(a->{
			System.out.print(a+" ");
		});
		System.out.println();
		List<Integer> sortedArr = selectionSort(arr);
		sortedArr.forEach(a->{
			System.out.print(a+" ");
		});
		System.out.println();
	}
}