package main.java.com.mps.wiley.util;

import java.util.Comparator;

import main.java.com.mps.wiley.ebb.domain.DynamicField;

public class DynamicFieldComparator implements Comparator
{
	public int compare(Object obj1, Object obj2){
	   
      /*
       * parameter are of type Object, so we have to downcast it
       * to Employee objects
       */
     
      int order1 = ((DynamicField)obj1).getFieldOrder();       
      int order2 = ((DynamicField)obj2).getFieldOrder();
     
      if(order1 > order2)
          return 1;
      else if(order1 < order2)
          return -1;
      else
          return 0;    
  }
}
