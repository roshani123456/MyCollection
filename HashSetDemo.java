package day21;


import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		//Declaration
		HashSet myset=new HashSet();
	//	Set myset=new HashSet();
	//	HashSet<String> myset=new HashSet<String>();

		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		System.out.println(myset);//[null, A, 100, 10.5, welcome]
		
		//size
		System.out.println("Size of set "+myset.size());
		
		//remove
		myset.remove(10.5);
		System.out.println("after removing "+myset);
		
		//insert the data -not possible
		//access the specific element-Not possible
		
		//convert hashset-->arraylsit
//		ArrayList al=new ArrayList(myset);
//		System.out.println(al);
//		
//		System.out.println(al.get(2));
//		
		//read the all value
		//for loop-not possible
		//for..each loop
		
	/*	for(Object x:myset) {
			System.out.println(x);
		}*/
		
		//Iterator
		
		Iterator it=myset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			
		//clearing the data
		myset.clear();
		System.out.println(myset);
		System.out.println(myset.isEmpty());//true
		}
}
