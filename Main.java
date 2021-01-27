import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		CoorparateCustomer coorparateCustomer1 = new CoorparateCustomer();
		coorparateCustomer1.coorparateName = "Starbucks";
		CoorparateCustomer coorparateCustomer2 = new CoorparateCustomer();
		coorparateCustomer2.coorparateName = "Nero";
	
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen kahve almak istediðiniz dükkanýn adýný giriniz.");
		String coorparateName = scanner.next();
		String starbucks = "Starbucks";
		
		if(coorparateName.equals(starbucks))
		{
		
		System.out.println("Doðrulama için tc kimlik no giriniz: ");
		String input = scanner.next();
		individualCustomer.tcNo = input;
		System.out.println("Ýsim:  ");
		input = scanner.next();
		individualCustomer.name = input;
		System.out.println("Soyisim: ");
		input = scanner.next();
		individualCustomer.surname = input;
		System.out.println("Doðum yýlý: ");
		int input2 = scanner.nextInt();
		individualCustomer.yearOfBirth = input2;
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Kahve sipariþinizi giriniz.");
		String order = scanner1.nextLine();
		
		IndividualCustomerManagerDal individualCustomerManager = new IndividualCustomerManagerDal();
		individualCustomerManager.checkCustomer(individualCustomer);
		individualCustomerManager.addCustomer(individualCustomer);
		CampaignManager starCampaignManager = new CampaignManager();
		Campaign starCampaign = new Campaign();
		starCampaign.campaignName = "Yýldýz";
		starCampaign.coorparateName = "Starbucks";
		System.out.println("Müþterinin " + order + " sipariþi alýndý.");
		starCampaignManager.showCampaign(starCampaign);
		}
		else
		{
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Kahve sipariþinizi giriniz.");
			String order = scanner2.nextLine();
			System.out.println("Müþterinin " + order + " sipariþi alýndý.");
			
			
		}
		
	}

}
