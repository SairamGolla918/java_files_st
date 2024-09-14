MySQL
1.Write a query to create a student table?

create table student(StId int,StName varchar(10)); -- 1

2. Write a query to create a student table using constraints?

create table 
student2(Id int not null,Name varchar(10) primary key,
characterestic varchar(30) unique,college varchar(30) default'IIIT RK Valley' ,
 age int,check (age<25)  ); -- 2
 
3.Write a query to see the list of users present in database?

select distinct user from mysql.user; -- 3

4. Write a query to display student’s information bases on sorting order of 
student id?

select * from student order by StId; -- 4

5. Write a query to see the list of records present in student table?

select * from student;  -- 5 

6.Write a query to display employees Id, employee name, employee salary and 
annual salary from employee table?

select id,name,salary,annual_salary from employee; -- 6

7.Write a query to display first five record form employee table?

select * from employee where empId between 10 and 20; -- 7

8. Write a query to see list of indexes present in database?

show indexes from student2; -- 8

9. How can we add constraint to an existing table?

alter table student1 add unique (Id); -- 9

10. Write a query to find the employee id whose salary lies in the range of 
9000 and 15000?

select * from id where  salary between 9000 and 15000; -- 10


JDBC
1. Write a JDBC application to insert a record into student table?
package task;

import java.sql.*;


public class student 
{

	public static void main(String[] args) 
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ass","root","S@iee918");
			Statement st = con.createStatement();
			int i = st.executeUpdate("insert into student values(101,'Narsi')");
			System.out.println(i+" rows effected");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

2. Write a JDBC application to display student name and address from 
student table?

package task;

import java.sql.*;


public class student 
{

	public static void main(String[] args) 
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ass","root","S@iee918");
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("select StName,StAddress from student");
			while(rs.next()) 
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}


3. Write a JDBC application to display student information based on student 
id?

package task;

import java.sql.*;


public class student 
{

	public static void main(String[] args) 
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ass","root","S@iee918");
			Statement st = con.createStatement();
			

			ResultSet rs = st.executeQuery("select * from student where StId = 5");
			
			while(rs.next()) 
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

4. Write a JDBC application to update student name based on student id?

package task;

import java.sql.*;


public class student 
{

	public static void main(String[] args) 
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ass","root","S@iee918");
			Statement st = con.createStatement();
			int i = st.executeUpdate("update student set StName = 'Kesava' where StId = 2");
			System.out.println(i);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

5. Write a JDBC application to delete a student record based on student id

package task;

import java.sql.*;


public class student 
{

	public static void main(String[] args) 
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ass","root","S@iee918");
			Statement st = con.createStatement();
			int i = st.executeUpdate("delete from student where StId = 101");
			System.out.println(i);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}