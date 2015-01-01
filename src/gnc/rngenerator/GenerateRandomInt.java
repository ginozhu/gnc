package gnc.rngenerator;

public class GenerateRandomInt {
	public static void main(String args[]) {
		RandomNumber r = new RandomNumber();
		double[] tmp = new double[120];
		for (int i = 0; i < 1000000; i++) {
			double x = 10 * (r.getRandomGaussianDouble(0, 2) + 6);
			if (x < 120 && x >= 0) {
				tmp[(int) x] += 0.001;
			}
		}
		for (int i = 0; i < 120; i++) {
			for (int j = 0; j < tmp[i]; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

	public double Norm_rand(double miu, double sigma2) {
		double N = 12;
		double x = 0, temp = N;
		do {
			x = 0;
			for (int i = 0; i < N; i++)
				x = x + (Math.random());
			x = (x - temp / 2) / (Math.sqrt(temp / 12));
			x = miu + x * Math.sqrt(sigma2);
		} while (x <= 0);
		return x;
	}
}
