package com.array_of_object;

public class Theater {

	int t_id;
	String t_name;
	String location;
	Movie m[];
	
	public Theater(int t_id, String t_name,String location,Movie[] m)
	{
		this.t_id=t_id;
		this.t_name=t_name;
		this.location=location;
		this.m=m;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//
//	@Override
//	public String toString() {
//		return "Theatre1 [t_id=" + t_id + ", t_name=" + t_name + ", location=" + location + ", m=" + Arrays.toString(m)
//				+ "]";
//	}
//	
//
//	
//
//}
