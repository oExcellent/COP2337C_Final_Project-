
public class Customer {
	String name;
	String address;
	String phoneNumber;
	String accountNumber;
	
		Customer(){
			name = "Max";
			address = "123 up wy";
			phoneNumber = "9541112222";
			accountNumber= "MW-2121";
		}
		Customer(String n, String a, String p, String aN){
			this.name = n;
			this.address = a;
			this.phoneNumber = p;
			this.accountNumber= aN;
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
			return this.accountNumber;
		}
		


}
