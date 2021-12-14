package org.encap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeDetail {

	public static void main(String[] args) {
		
	EmployeeInfo e = new EmployeeInfo();
	e.setEmpId(1234567);
	e.setName("qwerty");	
	//e.setPhone(1234567890l);	
		
	EmployeeInfo e1 = new EmployeeInfo();
	e1.setEmpId(12345678);
	e1.setName("ytrewq");		
//	e1.setPhone(1234567890l);
		
	EmployeeInfo e2 = new EmployeeInfo();
	e2.setEmpId(14326547);
	e2.setName("wreqwt");	
//	e2.setPhone(2143657655l);	
		
		List <EmployeeInfo> li = new ArrayList<>();
		li.add(e);
		li.add(e1);
		li.add(e2);
		
		for (int i = 0; i <li.size(); i++) {
			System.out.println("emp id is :"+li.get(i).getEmpId());
			System.out.println("emp name is:"+li.get(i).getName());
			System.out.println("emp phone is:"+li.get(i).getPhone());
		}
		
		System.out.println("************************************************");
		
		for (EmployeeInfo x: li) {
			System.out.println("emp id is :"+x.getEmpId());
			System.out.println("emp name is:"+x.getName());
			System.out.println("emp phone is"+x.getPhone());
			
			
		}
		System.out.println("****************************************************");
		
		Set<EmployeeInfo> s = new LinkedHashSet<>();
		s.add(e);
		s.add(e1);
		s.add(e2);
		
		for (EmployeeInfo y : s) {
			System.out.println("emp id is :"+y.getEmpId());
			System.out.println("emp name is :"+y.getName());
			System.out.println("emp phone is:"+y.getPhone());
		}
		Map<String,EmployeeInfo> m = new LinkedHashMap<>();
		m.put("person1", e);
		m.put("person2", e1);
		m.put("person3", e2);
		System.out.println("************************************************************");
		Set<Entry<String , EmployeeInfo>> entrySet = m.entrySet();
		
		
		for (Entry<String, EmployeeInfo> z: entrySet) {
			System.out.println(z.getKey());
			System.out.println("emp id is:"+z.getValue().getEmpId());
			System.out.println("emp name is:"+z.getValue().getName());
			System.out.println("emp phone is:"+z.getValue().getPhone());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
