package gnc.rngenerator;

import java.util.Date;
import java.sql.Time;

import gnc.rngenerator.RandomNumLib;

public class RandomNumber {
	//To generate N(mu, sigma^2) gaussian number, pass mu and sigma to this function
	public double getRandomGaussianDouble(double mu, double sigma) {
		try {
			if (sigma <= 0) {
				throw new Exception();
			}
			RandomNumLib r = RandomNumLib.getRandomNumLib();
			double nextGaussian = r.getRandomGaussianDouble();
			double result = mu + nextGaussian * sigma;
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	//Next Gaussion Date
	public Date getRandomGaussianDate(Date mu, Time sigma) {

		return mu;
	}
}
