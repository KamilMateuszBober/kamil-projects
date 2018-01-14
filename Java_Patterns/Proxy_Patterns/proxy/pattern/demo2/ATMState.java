package proxy.pattern.demo2;

public interface ATMState {

	void insertCard();
	
	void ejectCard();
	
	void insertPin(int pinEntered);
	
	void requestCash(int cashToWithdraw);
}
