
public class Customer {
	String name;
	String address;
	String phoneNumber;
	
		Customer(){
			name = "Max";
			address = "123 up wy";
			phoneNumber = "9541112222";
		}
		Customer(String n, String a, String p){
			this.name = n;
			this.address = a;
			this.phoneNumber = p;
		}
		
		public String getName(){
			return this.name;
		}
		public String getAddress(){
			return this.address;
		}
		public String getPhoneNumber(){
			return this.phoneNumber;
		}
		
		public void setName(String n){
			this.name = n;
		}
		public void setAddress(String a){
			this.address = a;
		}
		public void setPhoneNumber(String p){
			this.phoneNumber = p;
		}

}
