
public class IndividualCustomerManagerDal extends CustomerManager{
	public void checkCustomer(IndividualCustomer individualCustomer)
	{
		System.out.println("Bireysel müþteri e-devlet üzerinden doðrulandý.");
	}
	
	public void addCustomer(IndividualCustomer individualCustomer) {
	System.out.println("Bireysel müþteri sisteme eklendi.");
		
	}

	public void deleteCustomer(IndividualCustomer individualCustomer) {
	System.out.println("Bireysel müþteri sistemden silindi.");
		
	}

	public void updateCustomer(IndividualCustomer individualCustomerr) {
	System.out.println("Bireysel müþteri bilgileri güncellendi.");
		
	}

}
