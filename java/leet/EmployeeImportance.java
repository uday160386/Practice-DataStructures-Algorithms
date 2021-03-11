package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class EmployeeImportance {
	 int sum=0;
	 int startIndex=0;
	 ArrayList al= new ArrayList();
	 
	  public int getImportance(List<Employee> employees, int id) {
		  	al=extendGetImp(employees,id);
			for(int k=0;k<al.size();k++)
				   sum=sum+(int)al.get(k);
		return sum;
	    }
	 
	  public ArrayList extendGetImp(List<Employee> employees, int id)
	  {
		  for(int i=0;i<employees.size();i++)
		  {
			  if(employees.get(i).id==id)
			  {
				  al.add(employees.get(i).importance);
				  startIndex=i;
			  }
		  }
		  if(employees.get(startIndex).subordinates.size()>0)
		  {
			  Iterator its = employees.get(startIndex).subordinates.iterator();
				while(its.hasNext())
				{
					int a=(int)its.next();
					extendGetImp(employees,a);
				} 
		  }
		return al; 
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
