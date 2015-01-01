package gnc.rngenerator;

import java.util.Random;

public class RandomNumLib {
	public static RandomNumLib getRandomNumLib() {
		return new RandomNumLib();
	}
	public int getRandomLinearInt() {
		Random r = new Random();
		return r.nextInt();
	}
	public double getRandomLinearDouble() {
		Random r = new Random();
		return r.nextDouble();
	}
	public float getRandomLinearFloat() {
		Random r = new Random();
		return r.nextFloat();
	}
	public double getRandomGaussianDouble() {
		Random r = new Random();
		return r.nextGaussian();
	}
}
