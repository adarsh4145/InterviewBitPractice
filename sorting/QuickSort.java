import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class QuickSort{
	static void quickSort(List<Integer> arr,Integer start,Integer end){
		if(start<end){
			Integer partitionIndex = partition(arr,start,end);
			quickSort(arr,start,partitionIndex-1);
			quickSort(arr,partitionIndex+1,end);
		}
	}
	
	static Integer partition(List<Integer> arr,Integer start,Integer end){
		//int letPivotIndex = end;
		int pivot = arr.get(end);
		int partitionIndex = start;
		for(int i=start;i<end;i++){
			if(arr.get(i)<=pivot){
				int temp = arr.get(i);
				arr.set(i, arr.get(partitionIndex));
				arr.set(partitionIndex,temp);
				partitionIndex++;
			}
		}
		int temp = arr.get(end);
		arr.set(end, arr.get(partitionIndex));
		arr.set(partitionIndex, temp);
		return partitionIndex;
	}
	
	public static void main(String[] args){
		List<Integer> arr = new ArrayList<>(Arrays.asList(3,1,5,8,3,4,6,9,2,0,7));
		arr.forEach(v->{
			System.out.print(v+" ");
		});
		System.out.println();
		quickSort(arr,0,arr.size()-1);
		arr.forEach(v->{
			System.out.print(v+" ");
		});
		System.out.println();

	}
}