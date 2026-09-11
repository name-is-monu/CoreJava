package LooseCoupling;

public class Amazon 
{
	private DeliveryService deliveryService;
	
	//constructor DI
	public Amazon(DeliveryService deliveryService)
	{
		this.deliveryService=deliveryService;
	}
	
	
	//setter DI
    public void setDeliveryService(DeliveryService deliveryService)
    {
		this.deliveryService = deliveryService;
	}



	public Boolean DeliveryProvidedBy(Double amount)
    {
    	     return deliveryService.deliverProduct(amount);
    }
}
