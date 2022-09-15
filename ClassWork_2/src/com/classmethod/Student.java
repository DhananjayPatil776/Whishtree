

package com.classmethod;

public class Student 
{
	int s_id=1;
	float marks=98.6f;
	char div='A';
	
	void show()
	{
		System.out.println("Student id Is ...."+s_id);
		System.out.println("Student Marksa is...."+marks);
		System.out.println("Student Division is...."+div);
	}

	public static void main(String[] args) {
		Student s=new Student();
		s.show();
		
	

	}

}
