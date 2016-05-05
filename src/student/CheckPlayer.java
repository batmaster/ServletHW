package student;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.stereotype.Service;


@Service
public class CheckPlayer {
	public String checknoban (String x){
		
		String flag = "" ;
		
		Map<String,String> m = new HashMap<String,String>();
	//	HashMap<String, String> map = new HashMap<String, String>();
		
		m.put("kaka", "Y");
		m.put("ronaldo", "Y");
		m.put("mesi", "Y");
		m.put("surez", "N");
	    m.put("balotelle", "N");
	    
	    Collection<String> s = m.keySet();

	      /* ------------------------------------------------
	         Get an iterator over a Set
	         ----------------------------------------------- */
	      Iterator iter = s.iterator();


	      /* -------------------------
	         Iterate over "iter"
	         ------------------------- */
	      while(iter.hasNext())
	      {
	         String y;    // Help variable
	 
	         y = (String) iter.next();              // Get next entry      

	         if(y.equalsIgnoreCase(x)){
	        String status	= m.get(y) ;
	        	 if(status == "Y"){
	        		 flag = "Y" ;
	        	 }else{
	        		 flag = "N" ;
	        	 }
	        	 
	         }
	         System.out.println(y);
	      }
	    //  System.out.println();
		
		return flag;
		}
}
