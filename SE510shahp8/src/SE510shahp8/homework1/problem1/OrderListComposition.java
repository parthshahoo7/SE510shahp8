package SE510shahp8.homework1.problem1;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class OrderListComposition <T> {
			LinkedList<T> ll= new LinkedList<>();
		   Comparator<T> comparator;                   // comparator that determines the order
		   OrderListComposition(Comparator<T> c) {
		      this.comparator = c;
		   }
		   void insert(T item)                        // inserts item into its proper place in the list 
		   {
			ll.add(item); 
			Collections.sort(ll,comparator);
		   }
		   void delete(T item, Comparator<T> cmp)     // deletes all items that are equal to item, determined by cmp 
		   {
			   for(int i=0;i<size();i++)
			   {
				   if(cmp.compare(item,ll.get(i))==0)
						   {
					   			ll.remove(i);
								   i--;
						   }
			   }
		   }
		   int size()                               // returns the number of items in stack
		   {
			return ll.size();   
		   }
		   void print()                               // print all items in the format of [item0, item1, ...]
		   {
			   for(int i=0;i<size();i++)
			   {
				   System.out.println(ll.get(i).toString());				  
			   }
		   }
}
	