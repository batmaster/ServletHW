package student.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import student.*;

//The controller will be initiated by Spring when it finds the next annotation
@Controller
public class CalculatorController {

	
//Here is the magic. Just using @Autowired, Spring injects automatically our bean with the Service right from the container.
@Autowired
private Calculator calculatorService;


@Autowired
private CheckPlayer checkService ;

@Autowired
private CheckGrade checkgrade ;


@RequestMapping("calculate.do")
public  ModelAndView  calculate(HttpServletRequest res,HttpServletResponse response,@ModelAttribute("user") User user) throws IOException {
	
	String s1=res.getParameter("f1");
	String s2=res.getParameter("f2");
	
	
	int ss1=Integer.parseInt(s1);
	int ss2=Integer.parseInt(s2);

	
	 //**  *************************************/
	
	 String s3=res.getParameter("f3");
	 
	 
 // We make the calculation using the service defined into applicationContext.xml:)
//// response.getOutputStream().println("The result of the sum is : " + calculatorService.sum(ss1, ss2) +"The result of Player is "+checkService.checknoban(s3));
 
		
		
		
		
	    String grade = checkgrade.cal(s3) ;
	    
	    int temp = calculatorService.sum(ss1, ss2) ;
	 
	    User u = new User();
		u.setId(temp);
		u.setGrade(grade);
	
//	 response.getOutputStream().println("grade is : " +checkgrade.cal(s3) +"  "+  calculatorService.sum(ss1, ss2) + " \n  " );
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("user", u);
//		model.put("gr", g);
		
	
		
		return new ModelAndView("ans", model);

          //return "ans";
 
 
}
}


