package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer
{
	private Integer num;
	private String name;
	private Integer age;
	private Double avarage;
	
	public Cricketer() 
	{
		
	}

	public Cricketer(Integer num, String name, Integer age, Double avarage)
	{
		super();
		this.num = num;
		this.name = name;
		this.age = age;
		this.avarage = avarage;
	}

	@Override
	public String toString()
	{
		return "Cricketer [num=" + num + ", name=" + name + ", age=" + age + ", avarage=" + avarage + "]";
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getAvarage() {
		return avarage;
	}

	public void setAvarage(Double avarage) {
		this.avarage = avarage;
	}
	
	
	
}

public class Demo3
{

	public static void main(String[] args)
	{
		ArrayList<Cricketer> cList=new ArrayList<Cricketer>();
		cList.add(new Cricketer(8 , "Dhoni" ,46 , 95.6 ));
		cList.add(new Cricketer(7 , "Rahul" ,36 , 79.6 ));
		cList.add(new Cricketer(3 , "Ajay" ,18 , 89.0 ));
		cList.add(new Cricketer(2 , "Vikash" ,22 , 65.4 ));
		cList.add(new Cricketer(10 , "Amrit" ,20 , 55.5 ));
	 	
		
		//Comparator Using Lambda Expression
		
	Comparator<Cricketer> c1=new Comparator<Cricketer>()
	{

		@Override
		public int compare(Cricketer cri1, Cricketer cri2)
		{
			
//			return cri1.getName().compareTo(cri2.getName());  //sort by name 
//			return cri1.getAge() - cri2.getAge();   //sort By age accending order
//			return cri2.getAge() - cri1.getAge(); //sort By age dessending order
//			return  cri1.getNum() - cri2.getNum(); //sort by num
			
//			Double i= (cri1.getAvarage() - cri2.getAvarage());
			Double i= (cri2.getAvarage() - cri1.getAvarage());  //sort by Avarage
			return i.intValue();
		
		}	
	};
	
	System.out.println("Before Sorting :");
	System.out.println(cList);
	System.out.println("**********************");
	System.out.println("After Sorting ..");
	
	Collections.sort(cList , c1);
	
	System.out.println(cList);
	
	}

}
