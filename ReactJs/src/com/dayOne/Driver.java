package com.dayOne;

import java.util.ArrayList;
import java.util.Scanner;


public class Driver {
	
	public static void main(String[] args) {
		
		ArrayList<Student> student_list = new ArrayList<Student>();
		int choice;
		Scanner scan = new Scanner(System.in);
		Student stud;
		Boolean no_exit = true;
		
		while(no_exit)
		{
			System.out.println("Choose from the menu given below : ");
			System.out.println("1. Add a student.");
			System.out.println("2. View a student.");
			System.out.println("3. Delete a student.");
			System.out.println("4. View details of students whi scored more than 80.");
			System.out.println("5. Exit.");
			
			choice = scan.nextInt();
			
			switch(choice)
			{
			case 1 : stud = new Student(); 
					
					 System.out.println("Enter the student's name : ");
			
					 stud.setName(scan.nextLine());
					 scan.next();

					 System.out.println("ENter roll number : ");
					 stud.setRollno(scan.nextInt());
					 System.out.println("Enter address : ");
					 scan.next();
					 stud.setAddress(scan.nextLine());
					 System.out.println("Enter contact number : ");
					 stud.setPhone(scan.next());
					 System.out.println("Enter email : ");
					 stud.setEmail(scan.next());
					 System.out.println("Enter marks of first subject : ");
//					 stud.setMarks1(scan.nextFloat());
//					 System.out.println("Enter marks of second subject : ");
//					 stud.setMarks2(scan.nextFloat());
//					 System.out.println("Enter marks of third subject : ");
//					 stud.setMarks3(scan.nextFloat());
//					 System.out.println("Enter marks of fourth subject : ");
//					 stud.setMarks4(scan.nextFloat());
//					 System.out.println("Enter marks of fifth subject : ");
//					 stud.setMarks5(scan.nextFloat());
					 
					 int[] marks = new int[5];
					 for(int i=0;i<5;i++) {
						 marks[i]=scan.nextInt();
					 }
					 
					 student_list.add(stud);
					 break;
					 
			case 2 : if(student_list.size() > 0)
					 {
						int s_no,i = 1;
						
						System.out.println("Select a student from the list : ");
						
						for(Student s : student_list)
						{
							System.out.println(i + ". " + s.getName());
							i++;
						}
						
						s_no = scan.nextInt();
						
						System.out.println(student_list.get(s_no - 1));
						break;
					 }
					else
						System.out.println("Sorry! there are no students in the list.");
						break;
						
			case 3:
						if (student_list.size() > 0) {
							int s_no, i = 1;

							System.out.println("Select a student from the list : ");
							for (Student s : student_list) {
								System.out.println(i + ". " + s.getName());
								i++;
							}

							s_no = scan.nextInt();

							System.out.println("The student removed from the list : " + student_list.remove(s_no - 1));
							break;
						} 
						else
							System.out.println("Sorry! there are no students in the list.");
							break;
						
			case 4 : 
						for(Student s : student_list)
						{
							if(s.calc_average() > 80)
								System.out.println(s);
						}
						break;
						
			case 5 : System.out.println("Thank you!!!");
					 no_exit = false;
					 break;

			}
			
		}
	}

}
