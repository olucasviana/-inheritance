package entities;

public class Company extends TaxPayer {

	private Integer employees;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, Integer employees) {
		super(name, anualIncome);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public double tax() {
		double payment = 0.0;
		if (employees <= 10) {
			payment = getAnualIncome() * 0.16;
		}
		else {
			payment = getAnualIncome() * 0.14;
		}
		return payment;
	}
}
