
public class CoorparateCustomerManagerDal extends CustomerManager{

	public void addCustomer(CoorparateCustomer coorparateCustomer) {
		System.out.println("Þirket bilgileri veritabanýna eklendi.");
	}
	public void deleteCustomer(CoorparateCustomer coorparateCustomer) {
		System.out.println("Þirket bilgileri veritabanýndan silindi.");
	}
	public void updateCustomer(CoorparateCustomer coorparateCustomer) {
		System.out.println("Þirket bilgileri güncellendi.");
	}
}
