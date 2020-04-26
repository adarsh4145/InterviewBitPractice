import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
class InsertionSort{
	static List<Integer> insertionSort(List<Integer> arr){
		for(int i=1;i<arr.size();i++){
			Integer currentItem = arr.get(i);
			Integer currentIndex = i;
			while (currentIndex>0 && arr.get(currentIndex-1)>currentItem){
				arr.set(currentIndex, arr.get(currentIndex-1));
				currentIndex-=1;
			}
			arr.set(currentIndex,currentItem); 
		}
		return arr;
	}
	public static void main(String[] args){
		List<Integer> arr = new ArrayList<>(Arrays.asList(3,2,6,1,8,0,9,4,7,5,4));
		arr.forEach(a->{
			System.out.print(a+" ");
		});
		System.out.println();
		List<Integer> sortedArr = insertionSort(arr);
		sortedArr.forEach(a->{
			System.out.print(a+" ");
		});
		System.out.println();
	}
}