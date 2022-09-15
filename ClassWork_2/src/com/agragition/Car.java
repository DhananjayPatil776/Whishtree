

package com.agragition;

public class Car 
{
	private String c_Brand;
	private int price;
	private String colour;
	private Insurance i;
	
	public void setCBrand(String c_Brand)
	{
		this.c_Brand=c_Brand;
	}
	public String getCBrand()
	{
		return c_Brand;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	public void setColour(String colour)
	{
		this.colour=colour;
	}
	public String getColour()
	{
		return colour;
	}
	public void setInsurance(Insurance i)
	{
		this.i=i;
	}
	public Insurance getInsurance()
	{
		return i;
	}
	
	
}
