package com.shivaprasad.srp;

public class BankService {
	
	public long deposit(long amount, String accountNo)
	{
		//deposit amount
		return 0;
	}
	
	public long withDraw(long amount,String accountNo)
	{
		//withdraw amount
		return 0;
	}
	
	//Moved this method to PrinterService class
	public void printPassbook(String accountNo)
	{
		//update up to date transactions info in passbook and print
	}
	
	//Moved this method to LoanService class
	public void getLoanInterestInfo(String loanType) {
        if (loanType.equals("homeLoan")) {
            //do some job
        }
        if (loanType.equals("personalLoan")) {
            //do some job
        }
        if (loanType.equals("car")) {
            //do some job
        }
    }

	//Moved this method to NotificationService class
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
    }

}
