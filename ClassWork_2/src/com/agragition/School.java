
package com.agragition;

public class School 
{
	private int schoolId;
	private String schoolName;
	private String hmName;
	private Student st;
	
	
	public void setSchoolId(int schoolId)
	{
		this.schoolId=schoolId;
	}
	public int getSchoolId()
	{
		return schoolId;
	}
	public void setSchoolName(String schoolName)
	{
		this.schoolName=schoolName;
	}
	public String getSchoolName()
	{
		return schoolName;
	}
	public void setHmName(String hmName)
	{
		this.hmName=hmName;
	}
	public String getHmName()
	{
		return hmName;
	}
	public void setStudent(Student st)
	{
		this.st=st;
	}
	public Student getStudent()
	{
		return st;
	}
	
	
	
	
}
