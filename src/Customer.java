import java.util.Random;

public class Customer {
	String name;
	String address;
	String phoneNumber;
	String accountNumber;
	
		Customer(){
			name = "Max";
			address = "123 up wy";
			phoneNumber = "9541112222";
			accountNumber= "2121";
		}
		Customer(String n, String a, String p){
			this.name = n;
			this.address = a;
			this.phoneNumber = p;
			this.accountNumber= createAccount();
		}
		
		
		//Setters
		public void setName(String n){
			this.name = n;
		}
		public void setAddress(String a){
			this.address = a;
		}
		public void setPhoneNumber(String p){
			this.phoneNumber = p;
		}
		public void setAccountNumber(String a){
			this.accountNumber = a;
		}
		//account number generate
		String createAccount(){
			Random randomNum = new Random();
			int randomInt = randomNum.nextInt(9999);
			String rNum = String.format("%04d", randomInt);

			return rNum;
		}	
		//Getters
		public String getName(){
			return this.name;
		}
		public String getAddress(){
			return this.address;
		}
		public String getPhoneNumber(){
			return this.phoneNumber;
		}
		public String getAccountNumber(){
			return this.accountNumber = createAccount();
		}
		


}
