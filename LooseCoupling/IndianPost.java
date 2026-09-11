package LooseCoupling;

public class IndianPost implements DeliveryService
{

	@Override
	public Boolean deliverProduct(Double amount)
	{
		System.out.println("product Delivered By India Post ..");
		return true;
	}

}
