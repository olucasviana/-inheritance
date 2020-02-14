package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double payment = 0.0;
		if (getAnualIncome() < 20000.00) {
			payment = getAnualIncome() * 0.15 - healthExpenditures * 0.50;
		}
		else if(getAnualIncome() >= 20000.00) {
			payment = getAnualIncome() * 0.25 - healthExpenditures * 0.50;
		}
		return payment;
	}
}
