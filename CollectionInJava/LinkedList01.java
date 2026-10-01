package CollectionInJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList01
{

	public static void main(String[] args)
	{
	   LinkedList<Integer> list =new LinkedList<Integer>();
	   list.add(10);
	   list.add(50);
	   list.add(110);
	   list.add(20);
	   
	  Iterator<Integer> itr=list.iterator();
	  
	  while(itr.hasNext())
	  {
		  System.out.print(itr.next()+" ");
	  }

	}

}

/*ArrayList : List ansd Deque inteface dono ko implements karti hai.
    ArrayList Array and ArrayList ki tarah memory me data Contigous memory location par store 
    nhi karta hai balki ye memory me kahi bhi ho skte hai . ye doubly linked list ko 
    follow karke banaya gaya hai to har node apne se agale and pichale dono node ka address rakhta hai
    
    =>Data Access / Fetching (get(int index)) O(n)[Slow]:
    =>Insertion / Deletion (Beech mein ya shuruat mein) O(1)(agar reference ho) [Super Fast]:
    
    ->LinkedList : Ye data agar index se pecth karna hoto O(n) time leta hai.
    ->LinkedList : Agar data delete and indsert karna hoto O(1) time leta hai
    -> ArrayList : Agar Data Get Karna hoto ye O(1) time leta hai
    -> ArrayList : Aragr Data indsert ya delete karna hoto O(n) time leta hai.
 */