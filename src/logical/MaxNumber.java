package logical;

import org.testng.annotations.Test;

public class MaxNumber {
@Test
public void Max() {
	int [] arr= {2,4,3,8,100};
	int high=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>high) {
			high=arr[i];
		}
	}
	System.out.println(high);
}
}
