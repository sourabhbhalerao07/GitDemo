package defaultpackage;
class Test1 {
	private long accountNumber =10;
	private String str = "Pappu";
	protected int b = 87;

	
	public long getAccountNumber() {
		return accountNumber;
	}
	public String getStr() {
		return str;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setStr(String str) {
		this.str= str;
	}
	
}
public class EncapsulationDemo {

	
	public static void main(String args[]) {
		Test1 t = new Test1();
		System.out.println(t.getAccountNumber());
		System.out.println(t.getStr());
		t.setAccountNumber(500212);
		System.out.println(t.getAccountNumber());
		
		
	}
	
}
