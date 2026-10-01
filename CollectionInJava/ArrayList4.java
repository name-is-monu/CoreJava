package CollectionInJava;

import java.util.ArrayList;

public class ArrayList4 {

	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(200);
		list.add(100);
		list.add(40);
		
//		System.out.println(list.size());
		
//		ArrayList<Integer> list2=(ArrayList)list.clone();
		
//		System.out.println(list==list2);//false
//		System.out.println(list.equals(list2));//true because ArrayList implements this method..
		
		System.out.println(list);
		list.clear();  //[]
        System.out.println(list);
	}

}
