import java.util.Scanner;

public class WorkerTimeFLoor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] workersFloor = new int[3];
		for (int i=0; i<workersFloor.length; i++) {
			workersFloor[i] = sc.nextInt();
		}

		int timeSpent = 2; // to and from a different floor.
		int totalTimeSpentA;
		int totalTimeSpentB;
		int totalTimeSpentC;

		// if the machine is at the 1st floor.
		totalTimeSpentA = timeSpent*workersFloor[1] + 2*timeSpent*workersFloor[2];
		// if the machine is at the second floor.
		totalTimeSpentB = timeSpent*workersFloor[0] + timeSpent*workersFloor[2];
		// if the machine is at the third floor.
		totalTimeSpentC = 2*timeSpent*workersFloor[0] + timeSpent*workersFloor[1];

		// compare values to find the minium value
		int minimumTimeSpent = Math.min(totalTimeSpentA, Math.min(totalTimeSpentB, totalTimeSpentC));
		// print the minimum value.
		System.out.println(minimumTimeSpent);
		
		sc.close();
	}
}