package model.services;

public interface OnlineTaxService {
	
	double paymentFee(double amount);
	double interest(double amount, int months);
	
	
}
