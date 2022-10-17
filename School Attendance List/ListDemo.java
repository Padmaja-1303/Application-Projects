package com.school.svv.attendance;

public class ListDemo 
{
	public static void main(String[] args) 
	{
		AttendanceList list1 = new AttendanceList();
		AttendanceList list2 = new AttendanceList();
		AttendanceList list3 = new AttendanceList();
		AttendanceList list4 = new AttendanceList();
		AttendanceList list5 = new AttendanceList();
		
		list1.setFullName("Kaddy Sowe");
		list1.setRoll_No("1234");
		
		list2.setFullName("Adaza Sowe");
		list2.setRoll_No("1123");
		
		list3.setFullName("Jane Doe");
		list3.setRoll_No("12234");
		
		list4.setFullName("Stephen Hawkins");
		list4.setRoll_No("14567");
		
		list5.setFullName("Mary Jane");
		list5.setRoll_No("2397");
	
		System.out.println("\tStudent Attendance List");
		System.out.println("\t------------------------------------");
		System.out.println("\tFull Name\t\tRoll Number");
		System.out.println("\t------------------------------------");
		System.out.println("\t" + list1.getFullName() + "\t\t" + list1.getRoll_No());
		System.out.println("\t" + list2.getFullName() + "\t\t" + list2.getRoll_No());
		System.out.println("\t" + list3.getFullName() + "\t\t" + list3.getRoll_No());
		System.out.println("\t" + list4.getFullName() + "\t\t" + list4.getRoll_No());
		System.out.println("\t" + list5.getFullName() + "\t\t" + list5.getRoll_No());
	}

}
