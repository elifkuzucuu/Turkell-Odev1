
public class IndividualCustomerManagerDal extends CustomerManager{
	public void checkCustomer(IndividualCustomer individualCustomer)
	{
		System.out.println("Bireysel m��teri e-devlet �zerinden do�ruland�.");
	}
	
	public void addCustomer(IndividualCustomer individualCustomer) {
	System.out.println("Bireysel m��teri sisteme eklendi.");
		
	}

	public void deleteCustomer(IndividualCustomer individualCustomer) {
	System.out.println("Bireysel m��teri sistemden silindi.");
		
	}

	public void updateCustomer(IndividualCustomer individualCustomerr) {
	System.out.println("Bireysel m��teri bilgileri g�ncellendi.");
		
	}

}
