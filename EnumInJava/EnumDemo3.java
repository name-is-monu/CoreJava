package EnumInJava;

enum PaymentStatus
{
	SUCCESS, PANDING , FAILD;
	
	private int code;
	private String des;
	
	private PaymentStatus()
	{
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}
	
	
}
public class EnumDemo3
{

	public static void main(String[] args)
	{
		 PaymentStatus.SUCCESS.setCode(101);
		 PaymentStatus.SUCCESS.setDes("Paymet Sucess ");
		 
		 PaymentStatus success=PaymentStatus.SUCCESS;
		 System.out.println(success.getCode());
		 System.out.println(success.getDes());
		 
		 //----------------------------
		 
		 PaymentStatus faild=PaymentStatus.FAILD;
		 System.out.println(faild.getCode());
		 System.out.println(faild.getDes());
	}

}
