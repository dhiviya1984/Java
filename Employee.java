package Assignment2;

public class Employee {

	float basic_pay;
	float BOA;
	float bonus;
	
	float monthlygross_salary;
	float yearlygross_salary;
	float monthly_takehome_salary;
	float yearly_takehome_salary;
	float yearly_tax;
	float monthly_tax;
	float tax_rate;
	float pf;
	

	void monthlygross_salary() {
		
	}
	void yearlygross_salary() {
		
	}
	void tax() {
		
	}

	void takehome_Salary() {
		
	}
	
	void Display() {
		
	}

}

class Employee_Level extends Employee{
	
	//Constructor to assign value of Basic pay,BOA,Bonus
	
	public Employee_Level(float basic_pay1,float BOA1,float bonus1) {
		basic_pay=basic_pay1;
		BOA=BOA1;
		bonus=bonus1;
		
	}
	
	public void monthlygross_salary() {
		System.out.println(basic_pay);
		System.out.println(BOA);
		System.out.println(bonus);
		
		//pf=basic*0.12 
		
		pf=(float) (basic_pay*0.12);
		
		System.out.println("pf "+pf);
		
		//monthly gross_salary=(basic+boa+bonus)-PF
		
		monthlygross_salary=(basic_pay+BOA+bonus)-pf;
		System.out.println("monthlygross_salary "+monthlygross_salary);
				
	}
	
	public void yearlygross_salary() {
		
		yearlygross_salary=monthlygross_salary*12;
		System.out.println("yearlygross_salary "+yearlygross_salary);

	}

	public void tax() {
		
	
		if (yearlygross_salary<25000)
			tax_rate=0;
		else if (yearlygross_salary>=250000 & yearlygross_salary<500000)
			tax_rate=0.05f;
		else if (yearlygross_salary>=500000 & yearlygross_salary<1000000)
			tax_rate=0.2f;
		else
			tax_rate=0.3f;;
		
System.out.println("tax_rate "+tax_rate);
		//yearly tax=yearly gross * tax rate 
		
		yearly_tax=yearlygross_salary*tax_rate;
		monthly_tax=yearly_tax/12;
		
		System.out.println("yearly_tax "+yearly_tax);
		System.out.println("monthly_tax "+monthly_tax);
	
	}
	
	public void takehome_Salary() {
		
		//takehome_salary=monthlygross_salary-monthly tax 
		
		monthly_takehome_salary=monthlygross_salary-monthly_tax;
		yearly_takehome_salary=monthly_takehome_salary*12;
		System.out.println("monthly_takehome_salary "+monthly_takehome_salary);
		
	}
	
	public void display() {
		
		System.out.println("Monthly take home salary the employee is "+monthly_takehome_salary);
		System.out.println("Yaerly take home salary of the employee is "+yearly_takehome_salary);
		
	}
	
}
