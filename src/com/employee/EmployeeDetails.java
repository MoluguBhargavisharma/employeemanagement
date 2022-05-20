package com.employee;

import java.io.*;

public class EmployeeDetails {
	static DataInputStream ds=new DataInputStream(System.in);
	int eId[]=new int[10];
	int age[]=new int[10];
	int salary[]=new int[10];
	
	String name[]=new String[10];

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws IOException
	{
		EmployeeDetails obj=new EmployeeDetails();
		obj.input();
		int choice;
		do
		{
		
		
		System.out.println("press  1 for display all the employee details'\n press 2 for display the name in descending order\n press 3 for update the salary of particular employee\n pree 4 for exit");
		
		choice=Integer.parseInt(ds.readLine());
		
		switch(choice)
		{
		case 1:
			obj.show();
			break;
		case 2:
			obj.findNameiNDecending();
			break;
		case 3:
			obj.salaryUpdate();
			break;
		case 4:
			System.exit(0);
			
		
		}
		}
		while(choice>=1 && choice<=4);

	}
	void input()throws IOException
	{
		System.out.println("enter the ten employee details");
		for(int i=0;i<10;i++)
		{
			System.out.println("please enter the "+ (i+1)+" emoloyee id, name, age and salary");
			eId[i]=Integer.parseInt(ds.readLine());
			name[i]=ds.readLine();
			age[i]=Integer.parseInt(ds.readLine());
			salary[i]=Integer.parseInt(ds.readLine());
			
			
		}
	}
	void show()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+1 +"employee details");
			System.out.println("Employee id="+eId[i]+"\n employee name="+name[i]+"\n age="+age[i]+"\n salary="+salary[i]);
			System.out.println();
		}
	}
	void findNameiNDecending()
	{
		String temp;
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(name[i].compareTo(name[j])>0)
				{
					temp=name[i];
					name[i]=name[j];
					name[j]=temp;
				}
					
			}
		}
		System.out.println("all the name in descending order");
		for(String s: name)
		{
			System.out.println(s);
		}
	}
	void salaryUpdate()throws IOException
	{
		System.out.println("please enter the employee id for updating salary");
		int temp=Integer.parseInt(ds.readLine());
		for(int i=0;i<10;i++)
		{
			if(temp==eId[i])
			{
				System.out.println("plesae enter the amount for update the salary");
				int updateSalary=Integer.parseInt(ds.readLine());
				salary[i]=salary[i]+updateSalary;
			
			System.out.println("Emplyee id="+eId[i]+"\n name="+name[i]+ "\n age="+age[i]+ "\n salary="+salary[i]);
			}
		}
		
	}

}

	

	


