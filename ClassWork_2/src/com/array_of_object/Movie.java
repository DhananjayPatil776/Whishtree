package com.array_of_object;

public class Movie {

	int m_id;
	String m_name;
	float rating;
	
	public Movie(int m_id,String m_name,float rating)
	{
		this.m_id=m_id;
		this.m_name=m_name;
		this.rating=rating;
		
	}
	
	
	@Override
	public String toString() {
		return "Movie m_id=" + m_id + "\n m_name=" + m_name + "\nrating=" + rating ;
	}




}


