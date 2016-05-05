package student;

import org.springframework.stereotype.Service;

@Service
public class CheckGrade {
	
	public String cal(String xx){
		
		int x = Integer.parseInt(xx) ;
		
		String g="";
		if(x>=50&&x<60){
			
		g="D";
		}else if(x>=60&&x<70){
		g="C";
		}else if(x>=70&&x<80){
		g="B";
		}else if(x>=80&&x<=100){
		g="A";
		}else{
		g="F";
		}
		return g;
		

	}

}
