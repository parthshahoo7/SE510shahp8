package SE510shahp8.homework1.problem1;

import java.util.Comparator;

public class OrderListCompositionTester {
	
	public static void main(String[] args)
	{
		Comparator<Student> Comparator =new Comparator<Student>() {
			
			@Override
			public int compare(Student ns, Student cs) {
				// TODO Auto-generated method stub
				if(ns.getId()>cs.getId())
				{
					return 1;
				}
				else if(ns.getId()==ns.getId())
				{
					return 0;
				}
				else
					return -1;
			}
		};
		OrderListComposition<Student> studentList=new OrderListComposition<Student>(Comparator);
		Student s1=new Student("PARTH",123456,22);
		Student s2=new Student("Avish", 456980, 23);
		Student s3=new Student("AKASH",678923,22);
		Student s4=new Student("Joe",656789,18);
		Student s5= new Student("Andy",123456,24);
		Student s6=new Student("Denny",656789,45);
		studentList.insert(s1);
		studentList.insert(s2);
		studentList.insert(s3);
		studentList.insert(s4);
		studentList.insert(s5);
		studentList.insert(s6);
		
		System.out.println("All Student List is insserted, inserted list is:");
		studentList.print();
		System.out.println();
		System.out.println("Total LIst::"+studentList.size());
		System.out.println();
		System.out.println("Deleting Student Info Start:");
		System.out.println();
		studentList.delete(s2,Comparator);
		System.out.println("Available List:"+studentList.size());
		System.out.println();
		studentList.print();
		studentList.delete(s4, Comparator);
		System.out.println("Available List:"+studentList.size());
		System.out.println();
		studentList.print();
		studentList.delete(s6,Comparator);
		System.out.println("Available List:"+studentList.size());
	}

}
