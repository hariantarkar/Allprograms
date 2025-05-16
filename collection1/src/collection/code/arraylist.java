package collection.code;

import java.util.ArrayList;
import java.util.*;
public class arraylist {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		Vector v =new Vector(al);
		System.out.println(v);
		
	}

}
