package LooseCoupling;

public class EkartLogistics implements DeliveryService
{
	@Override
	public Boolean deliverProduct(Double amount)
	{
		System.out.println("product Delivered By Ekart Logistic  ..");
		return true;
	}

}
