
public class CoorparateCustomerManagerDal extends CustomerManager{

	public void addCustomer(CoorparateCustomer coorparateCustomer) {
		System.out.println("�irket bilgileri veritaban�na eklendi.");
	}
	public void deleteCustomer(CoorparateCustomer coorparateCustomer) {
		System.out.println("�irket bilgileri veritaban�ndan silindi.");
	}
	public void updateCustomer(CoorparateCustomer coorparateCustomer) {
		System.out.println("�irket bilgileri g�ncellendi.");
	}
}
