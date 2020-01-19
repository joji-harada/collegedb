package utility;

import utility.Comparable;
import utility.Comparator;
import utility.List;
import college.Student;

public class Batch {
	public static <T extends Comparable<T>> int binarySearch(List<T> list, T key) {
		int min = 0;
		int max = list.size() - 1;
		int mid;
		
		while(min <= max) {
			mid = (min + max) / 2;
			if(list.get(mid).compareTo(key) == 0) {
				return mid;
			} else if(list.get(mid).compareTo(key) < 0){
				min = mid + 1;
			} else {
				max = mid - 1;
			}
		}
		return -1;
	}
	
	public static <T extends Comparable<T>> int indexOf(List<Student> list, String nameKey) {
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).name().compareTo(nameKey) == 0) {
				return i;
			}
		}
		return -1;
	}
	
	private static <T extends Comparable<T>> int partition(List<T> list, int left, int right) {
	     int midpoint;
	     T pivot;
	     T temp;
	     boolean done;

	     midpoint = left + (right - left) / 2;
	     pivot = list.get(midpoint);

	     done = false;

	     while (!done) {
	         while (list.get(left).compareTo(pivot) < 0) {
	            ++left;
	         }
	         while (pivot.compareTo(list.get(right)) < 0) {
	            --right;
	         }
	         if (left >= right) {
	            done = true;
	         } 
	         else {	        	
	            temp = list.get(left);
	            list.set(left, list.get(right));
	            list.set(right, temp);
	            ++left;
	            --right;
	         }
	     }

	     return right;
    }
	
	public static <T extends Comparable<T>> void quickSort(List<T> list) {
		quickSort(list, 0, list.size() - 1);
	}
	
	public static <T extends Comparable<T>> void quickSort(List<T> list, int left, int right) {
	     int j;

	     if (left >= right) {
	    	  return;
	     }
	     
	     j = partition(list, left, right);

	     quickSort(list, left, j);
	     quickSort(list, j + 1, right);
	  }
	
	public static <T> void selectionSort(List<T> list, Comparator<T> key) {
	     
	     int indexSmallest;
	     T temp;

	     for (int i = 0; i < list.size() - 1; ++i) {

	        indexSmallest = i;
	        for (int j = i + 1; j < list.size(); ++j) {
	        	 if(key.compare(list.get(j), list.get(indexSmallest)) < 0) {
	        		 indexSmallest = j;
	        	 }
	        }
	        temp = list.get(i);
	        list.set(i, list.get(indexSmallest));	        
	        list.set(indexSmallest, temp);
	    }
	}
}
