import java.util.Scanner;

public class SeatAllocation {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the show");
		int n = in.nextInt();
		System.out.println("Enter the number of seats to be booked");
		int b = in.nextInt();

		int input_arr[] = new int[n * n];
		int k = 0;
		int seat_array[] = new int[b];
		for (int i = 1; i <= b; i++) {
			System.out.println("enter the seat number " + i);
			seat_array[k++] = in.nextInt();
		}
		for (int i = 0; i < n * n; i++) {
			input_arr[i] = 0;
		}
		try {
			for (int i = 0; i < seat_array.length; i++) {
				if (input_arr[seat_array[i]] == 0) {
					input_arr[seat_array[i]] = 1;
				} else {
					throw new Exception("Aleary Booked");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		int out_arr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				out_arr[i][j] = input_arr[i * n + j];
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(out_arr[i][j]);
			}
			System.out.println();
		}

	}

}
