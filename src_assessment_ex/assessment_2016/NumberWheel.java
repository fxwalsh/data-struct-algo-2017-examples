package assessment_2016;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberWheel {
	
	public List<Integer> wheelNumbers;
	public List<Integer> sumNumbers;

	public NumberWheel(List<Integer> wheelNumbers) {
		super();
		this.wheelNumbers = wheelNumbers;
		Collections.sort(wheelNumbers);
		
	}

	public static void main(String[] args) {
		List<Integer> wheelNumbers = Arrays.asList(34,127,52,75,42,94,106,99);
		List<Integer> sumNumbers=Arrays.asList(169,268,285);
		
		NumberWheel wheel = new NumberWheel(wheelNumbers);
		
		for (Integer i : sumNumbers){
		     List<Integer> result = wheel.find3Sum(i);
		     if (result!=null && result.size()==3)
		     System.out.println(result.get(0)+"+"+result.get(1)+"+"+result.get(2)+"="+i);
		}

	}

	public List<Integer> find3Sum(Integer target) {
		int size=wheelNumbers.size();
		for(int i=0;i<size;i++){
			for (int j = i+1 ;j<size-1;j++){
				int diff = target-wheelNumbers.get(i)-wheelNumbers.get(j);
				if (Collections.binarySearch(wheelNumbers.subList(j+1, size),diff)>=0){
					return Arrays.asList(wheelNumbers.get(i),wheelNumbers.get(j),diff);
				}
			}
		}
		return null;
	}

}
