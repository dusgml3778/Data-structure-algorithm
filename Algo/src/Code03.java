
public class Code03 {

	public static void main(String[] args) {

		int[] data = { 1, 2, 3, 4, 5, 6 };

		int search = search(data, data.length, 5);

		if(search!=-1) {

			System.out.printf("I found it index=%d", search);
			
		} else {
			System.out.println("Not Found");
		}

	}

	private static int search(int[] data, int n, int target) {

		for (int i = 0; i < n; i++)
			if (data[i] == target)
				return i;

		return -1;

	}

}
