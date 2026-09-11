package LooseCoupling;

public class MainApp
{
    public static void main(String[] args)
    {
		Amazon amazon=new Amazon(new EkartLogistics());
		Boolean status=amazon.DeliveryProvidedBy(5000.500);
		
		if(status)
		{
			System.out.println("Delivery Sucess..");
		}
		else
		{
			System.out.println("Delivery Faield ..");
		}
	}
}
