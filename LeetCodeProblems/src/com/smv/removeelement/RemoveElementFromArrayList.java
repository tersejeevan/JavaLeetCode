package com.smv.removeelement;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementFromArrayList {
	public void removeElement(){
    {
        List al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(1);
        al.add(2);
 
        // This makes a call to remove(Object) and removes element 1
        al.remove(new Integer(1));
         
        // This makes a call to remove(Object) and removes element 2
        al.remove(new Integer(2));
        System.out.println("Modified ArrayList : " + al);
}   
}
public static void main(String[] args) {
	
	RemoveElementFromArrayList re = new RemoveElementFromArrayList();
	re.removeElement();	
}
}