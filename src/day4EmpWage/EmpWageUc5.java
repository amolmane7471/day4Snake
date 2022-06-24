package day4EmpWage;
import java.lang.Math;
public class EmpWageUc5 {
	public static final	int IS_PARTTIME=1;
	public static final	int IS_FULLTIME=2;
	public static final	int EMP_RATE_PER_HOUR=20;
	public static final	int NUM_WORKING_DAYS=20;
	public static void main(String[] args) {
	    int empHrs, empWage,totalEmpWage=0;
	    for (int day=1;day<=NUM_WORKING_DAYS;day++)
	    {	int empcheck=(int)Math.floor(Math.random()*10)%3;
		switch (empcheck) {
		case IS_PARTTIME:
			empHrs=4;
			break;
		case IS_FULLTIME:
	    empHrs=8;
	    break;
	default:
	    empHrs=0;
		}
empWage=empHrs*EMP_RATE_PER_HOUR;
totalEmpWage+=empWage;
	System.out.println("Emp Wage:"+empWage);
	    }
	    System.out.println("Total Emp Wage Is:"+totalEmpWage);
	}

}
