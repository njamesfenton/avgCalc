import java.text.DecimalFormat;
import java.util.*;

public class avgCalc {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String another = "y";
		while (another.equalsIgnoreCase("y")) {
			System.out.println("Enter total number of at bats!");
			double total = 0;
			int atBats = input.nextInt();
			int[] basesEarned = new int[atBats];
			DecimalFormat df2 = new DecimalFormat("#.000");

			total = battingAvg(input, total, basesEarned);
			double hits = 0;
			hits = slugging(basesEarned, hits);
			double battingAvg = hits / atBats;
			double slugging = total / atBats;
			System.out.println(df2.format(battingAvg));
			System.out.println(df2.format(slugging));

			System.out.println("Would you like to enter another batter? (y/n)");
			another = input.nextLine();

		}
	}

	/**
	 * @param basesEarned
	 * @param hits
	 * @return
	 */

	public static double slugging(int[] basesEarned, double hits) {
		for (int i = 0; i < basesEarned.length; i++) {
			if (basesEarned[i] > 0) {
				hits++;
			}
		}
		return hits;
	}

	/**
	 * @param input
	 * @param total
	 * @param basesEarned
	 * @return
	 */
	public static double battingAvg(Scanner input, double total, int[] basesEarned) {
		for (int i = 0; i < basesEarned.length; i++) {
			System.out.println("Enter total bases earned 0-4");
			basesEarned[i] = input.nextInt();
			input.nextLine();
			total = total + basesEarned[i];
		}
		return total;
	}
}
