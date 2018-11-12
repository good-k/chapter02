package bit2018.goodsman.db;

import bit2018.goodsman.data.Customer;

public class CustomerDB {
	void insert() {
		Customer c = new Customer();
		
		//public은 다른패키지(외부)접근 o
		c.name = "안대혁";
		
		//protected은 다른패키지(외부)접근 x
		//c.phone = "0000-0000-0000";
		
		//private은 다른패키지(외부)접근 x
		//c.email = "kickscar@gmail.com";
		
	}
}
