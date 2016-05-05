package student;

import org.springframework.stereotype.Service;

@Service
public class Calculator {
	
public Calculator() {
System.out.println("Calculator initialized by Spring !!");
}

public int sum (int number1, int number2){
return number1 + number2;
}



}
