package LooseCoupling;

public class BlueDortExpress implements DeliveryService
{
	@Override
	public Boolean deliverProduct(Double amount)
	{
		System.out.println("product Delivered By BlueDortExpress ..");
		return true;
	}

}
