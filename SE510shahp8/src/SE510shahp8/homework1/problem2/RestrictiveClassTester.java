package SE510shahp8.homework1.problem2;

import java.util.Scanner;

public class RestrictiveClassTester {
	public static void main(String[] args) {

		int i, id = 1;
		char c = 0;
		Scanner in = new Scanner(System.in);
		RestrictiveClass r = RestrictiveClass.requestInstance();
		System.out.println("Occupied instance id is:" + r.getInstanceId());
		id++;
		do {
			System.out.println("To occupy instance Press 1 and for realease Press 0");
			i = in.nextInt();
			if (i == 1) {

				if (id > 5) {
					System.out.println("Sorry You cant create instance.");
					continue;
				} else {
					RestrictiveClass.requestInstance();
					System.out.println("Occupied instance id is:" + r.getInstanceId());
					id++;
				}
			} else if (i == 0) {
				System.out.println("Release Instance id:" + r.getInstanceId());
				RestrictiveClass.releaseInstance(r);
				id--;
				System.out.println("Current Instance id is:" + r.getInstanceId());
			}
			System.out.println("Do you Want to continue Press y/n");
			c = in.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		in.close();
		/*
		 * int i,id=0; Scanner in=new Scanner(System.in); RestrictiveClass r1
		 * =RestrictiveClass.requestInstance(); id++;
		 * System.out.println("occupied instance Id:"+r1.getInstanceId());
		 * System.out.println("Do you want to occupy? 1/0"); i=in.nextInt(); do {
		 * if(i==1) { RestrictiveClass r2= RestrictiveClass.requestInstance();
		 * System.out.println("Occupied Instance Id:"+r2.getInstanceId()); id++;
		 * System.out.println("Do you want to occupy? 1/0"); i=in.nextInt(); if(i==1) {
		 * 
		 * RestrictiveClass r3= RestrictiveClass.requestInstance();
		 * System.out.println("Occupied Instance Id:"+r3.getInstanceId()); id++;
		 * System.out.println("Do you want to occupy? 1/0"); i=in.nextInt(); if(i==1) {
		 * RestrictiveClass r4= RestrictiveClass.requestInstance();
		 * System.out.println("Occupied Instance Id:"+r3.getInstanceId()); id++;
		 * System.out.println("Do you want to occupy? 1/0"); i=in.nextInt(); if(i==1) {
		 * RestrictiveClass r5= RestrictiveClass.requestInstance();
		 * System.out.println("Occupied Instance Id:"+r3.getInstanceId()); id++;
		 * System.out.println("Do you want to occupy? 1/0"); i=in.nextInt(); if(i==1) {
		 * System.out.println("You can not create Instances All are resereved");
		 * System.out.println("Do you want to release?1/0");
		 * System.out.println("Relase Instance Id:"+r5.getInstanceId());
		 * RestrictiveClass.releaseInstance(r5);
		 * 
		 * } else { System.out.println("Relase Instance Id:"+r5.getInstanceId());
		 * 
		 * RestrictiveClass.releaseInstance(r5); } } else {
		 * System.out.println("Relase Instance Id:"+r4.getInstanceId());
		 * RestrictiveClass.releaseInstance(r4); } } else {
		 * System.out.println("Relase Instance Id:"+r3.getInstanceId());
		 * RestrictiveClass.releaseInstance(r3); } } else {
		 * System.out.println("Relase Instance Id:"+r2.getInstanceId());
		 * RestrictiveClass.releaseInstance(r2); }
		 * 
		 * } else { System.out.println("Release Instance Id:"+r1.getInstanceId());
		 * RestrictiveClass.releaseInstance(r1); } }while(id<=5); in.close();
		 */

		/*
		 * while(i==1) {
		 * 
		 * RestrictiveClass r2=RestrictiveClass.requestInstance();
		 * System.out.println("Instance is occupied");
		 * System.out.println(r2.getInstanceId());
		 * System.out.println("Do you want to occupy? 1/0"); i=in.nextInt(); }
		 */
	}
}
