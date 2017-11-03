package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IndexOfTwoListsRes {
	
	public String[] findRestaurant(String[] list1, String[] list2) {
		
		HashMap hm1=new HashMap();
		Set s=new HashSet();
		Set sn=new HashSet();
		
		
		for(int i=0;i<list1.length;i++)
		{
			hm1.put(list1[i], i);
			if(!s.add(list1[i]));
		}
		HashMap hm2=new HashMap();
		for(int i=0;i<list2.length;i++)
		{
			hm2.put(list2[i], i);
			if(!s.add(list2[i]))
				sn.add(list2[i]);
				
		}
		Iterator i=sn.iterator();
		int counter=hm1.size()+hm2.size();
		
		HashMap<Integer,String> list= new HashMap();
		int p=0;
		while(i.hasNext())
		{
			String st=(String)i.next();
			if(counter>=((int)hm1.get(st)+(int)hm2.get(st)))
			{
				counter=(int)hm1.get(st)+(int)hm2.get(st);
				if(list.get(counter)!=null)
					list.put(counter, list.get(counter)+":_"+st);
				else
					list.put(counter, st);
			}
		}
		
		String[] ansListlist1 = list.get(counter).split(":_");
		
		for(int n=0;n<ansListlist1.length;n++)
		{
			ansListlist1[p]=ansListlist1[n];
			p++;
		}
			
				
		return ansListlist1;
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndexOfTwoListsRes obj= new IndexOfTwoListsRes();
		String[] list1={"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list2={"KFC","Burger King","Tapioca Express","Shogun"};
		String a[]=obj.findRestaurant(list1, list2);				
		
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
	}

}
