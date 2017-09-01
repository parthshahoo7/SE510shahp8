package SE510shahp8.homework1.problem1;

import java.util.Comparator;
import java.util.LinkedList;

public class OrderListInheritance <T> extends LinkedList<T> {
		   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		Comparator<T> comparator;                   // comparator that determines the order
		   OrderListInheritance(Comparator<T> c) {
		      this.comparator = c;
		   }
		   void insert(T item)                        // inserts item into its proper place in the list 
		   {
			add(item); 
			sort(comparator);
		   }
		   void delete(T item, Comparator<T> cmp)     // deletes all items that are equal to item, determined by cmp 
		   {
			   for(int i=0;i<size();i++)
			   {
				   if(cmp.compare(item,get(i))==0)
				   	{
					   remove(i);
					   i--;
					}
			   }
		   }
		   int Linked_size()                               // returns the number of items in stack
		   {
			  return size();
		   }
		   void print()                               // print all items in the format of [item0, item1, ...]
		   {
			   for(int i=0;i<size();i++)
			   {
				   System.out.println(get(i).toString());				  
			   }
		   }
}
	