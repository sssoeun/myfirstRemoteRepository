package collection1;

import java.util.ArrayList;

public class ListTest1_1 {

	public static void main(String[] args) {
		ArrayList<Double> arrayList = new ArrayList<Double>();
		
		System.out.println(arrayList);
		
		arrayList.add(10.0);
		arrayList.add(20.0);
		arrayList.add(30.0);
		
		System.out.println(arrayList);
		
		double tot = 0;
		
		for(double result : arrayList) {
			tot += result;
		}
		
		System.out.println(tot);
		
		
	}

}
