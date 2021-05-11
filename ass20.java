package mypack;

public class ass20 {

	public static void main(String[] args) {
        int[] array = {6,9,3,8,6,7};
		
		double sum = 0;
		double avg;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("Sum: " + sum);
		avg = sum / array.length;
		
		System.out.println("Average: " + avg);

	}

}
