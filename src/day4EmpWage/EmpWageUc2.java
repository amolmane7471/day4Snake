package day4EmpWage;
import java.lang.Math;
public class EmpWageUc2 {

	public static void main(String[] args) {
		int IS_FULLTIME=1;
		int EMP_RATE_PER_HOUR=20;
		int empHrs;
		int empWage;
		double empcheck=Math.floor(Math.random()*10)%2;
if(empcheck==IS_FULLTIME)
	empHrs=8;
else 
	empHrs=0;
empWage=empHrs*EMP_RATE_PER_HOUR;
	System.out.println("Emp Wage:"+empWage);
	}

}
