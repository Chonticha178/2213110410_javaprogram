
public class ATMData {
	private String accountName;
	private String password;
	
	public ATMData(String accountName,String password) {
		this.accountName=accountName;
		this.password=password;
	}
	public String getID() {
		return this.accountName;
	}
	public String getPass() {
		return this.password;
	}
}
