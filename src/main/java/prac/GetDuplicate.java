package prac;

public class GetDuplicate {
	public void getDuplicate(int[] b) {
		for (int i = 0; i < b.length; i++) {
			for (int j = (i + 1); j < b.length; j++) {
				if (b[i] == b[j]) {
					System.out.println(b[j]);
				}

			}
		}
	}

	public static void main(String[] args) {
		int[] b = { 2, 3, 3, 4, 5, 6, 6, 7 };
		GetDuplicate obj = new GetDuplicate();
		obj.getDuplicate(b);
	}

}
