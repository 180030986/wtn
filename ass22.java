package mypack;

public class ass22 {

	public static void main(String[] args) {
		int[] array = {9, 4, 8, 6, 4, 7, 9};
		int key= 8;
		int index = -1;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				index = i + 1;
				break;
			}
		}

		System.out.println(index);

	}

}
