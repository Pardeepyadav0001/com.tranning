package com.prorigo.training;
import java.util.*;
public class learnset {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Set<student> ob=new HashSet();
		
		ob.add(new student("prdeep",45));
		ob.add(new student("kunal",453));
		ob.add(new student("mrunal",25));
		
		System.out.println(ob);
	}

}
