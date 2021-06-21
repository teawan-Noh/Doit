package chapter8;

public class CustomerTest1 {

	public static void main(String[] args) {
		
	/*	Customer customerLee = new Customer();
		customerLee.setCustomerID(10100);
		customerLee.setCustomerName("LEE");
*/
		VIPCustomer customerKim = new VIPCustomer(10101, "Kim", 100);
		
		customerKim.bonusPoint = 1000;
	
//		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
	}
}