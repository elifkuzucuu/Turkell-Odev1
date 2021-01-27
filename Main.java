import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		CoorparateCustomer coorparateCustomer1 = new CoorparateCustomer();
		coorparateCustomer1.coorparateName = "Starbucks";
		CoorparateCustomer coorparateCustomer2 = new CoorparateCustomer();
		coorparateCustomer2.coorparateName = "Nero";
	
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen kahve almak istedi�iniz d�kkan�n ad�n� giriniz.");
		String coorparateName = scanner.next();
		String starbucks = "Starbucks";
		
		if(coorparateName.equals(starbucks))
		{
		
		System.out.println("Do�rulama i�in tc kimlik no giriniz: ");
		String input = scanner.next();
		individualCustomer.tcNo = input;
		System.out.println("�sim:  ");
		input = scanner.next();
		individualCustomer.name = input;
		System.out.println("Soyisim: ");
		input = scanner.next();
		individualCustomer.surname = input;
		System.out.println("Do�um y�l�: ");
		int input2 = scanner.nextInt();
		individualCustomer.yearOfBirth = input2;
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Kahve sipari�inizi giriniz.");
		String order = scanner1.nextLine();
		
		IndividualCustomerManagerDal individualCustomerManager = new IndividualCustomerManagerDal();
		individualCustomerManager.checkCustomer(individualCustomer);
		individualCustomerManager.addCustomer(individualCustomer);
		CampaignManager starCampaignManager = new CampaignManager();
		Campaign starCampaign = new Campaign();
		starCampaign.campaignName = "Y�ld�z";
		starCampaign.coorparateName = "Starbucks";
		System.out.println("M��terinin " + order + " sipari�i al�nd�.");
		starCampaignManager.showCampaign(starCampaign);
		}
		else
		{
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Kahve sipari�inizi giriniz.");
			String order = scanner2.nextLine();
			System.out.println("M��terinin " + order + " sipari�i al�nd�.");
			
			
		}
		
	}

}
