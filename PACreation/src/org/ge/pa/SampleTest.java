package org.ge.pa;

import java.util.ArrayList;
import java.util.List;

public class SampleTest {

	public List<String> getList(){
		
		List<String> l1=new ArrayList<String>();
		//l1.add("5510251");l1.add("5510252");
		//l1.add("5510254");l1.add("5510253");
		
		List<String> l2=new ArrayList<String>();
		l2.add("4510251");l2.add("4510252");
		l2.add("4510254");l2.add("4510253");
		
		List<String> l3=new ArrayList<String>();
		l3.add("3510251");l3.add("3510252");
		l3.add("3510254");l3.add("3510253");
		
		List<String> l4=new ArrayList<String>();
		l4.add("2510251");l4.add("2510252");
		l4.add("2510254");l4.add("2510253");
		
		List<String> checkList=new ArrayList<String>();
		checkList.add("9510251");checkList.add("4510252");
		checkList.add("3510254");
		
		List<String> resultList=new ArrayList<String>();
		String s="";
		for(int i=0;i<checkList.size();i++){
			s="N";
			if(l1!=null){
			for(int j=0;j<l1.size();j++){
				if(l1.get(j).contains(checkList.get(i))){
					s="Y";
					break;
				}
			}
			}
			if(s=="N"){
			for(int j=0;j<l2.size();j++){
				if(l2.get(j).contains(checkList.get(i))){
					s="Y";
					break;
				}
			}
			}
			if(s=="N"){
				for(int j=0;j<l3.size();j++){
					if(l3.get(j).contains(checkList.get(i))){
						s="Y";
						break;
					}
				}
				}
			
			if(s=="N"){
				for(int j=0;j<l4.size();j++){
					if(l4.get(j).contains(checkList.get(i))){
						s="Y";
						break;
					}
				}
				}
			if(s=="N")
			resultList.add(i,"N");
			if(s=="Y")
			resultList.add(i,"Y");	
			
		}
		
		return resultList;
	}
	
	public static void main(String args[]){
		SampleTest test=new SampleTest();
		List<String> result=test.getList();
		for(String s:result){
			System.out.println(s);
		}
	}
}
