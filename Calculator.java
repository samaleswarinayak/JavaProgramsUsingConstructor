/* DEFINE A CLASS CALCULATOR WITH THE FOLLOWING METHODS:     A STATIC METHOD CALLED POWERINT(INT NUM1,INT NUM2)  THIS METHOD SHOULD RETURN NUM1 TO THE POWER NUM2. A STATIC METHOD CALLED POWERDOUBLE(DOUBLE NUM1,INT NUM2). THIS METHOD SHOULD RETURN NUM1 TO THE POWER NUM2. INVOKE BOTH THE METHODS AND TEST THE FUNCTIONALITIES. HINT: USE MATH.POW(DOUBLE,DOUBLE) TO CALCULATE THE POWER. */

class Calculator
{
	static void Powerint(int num1,int num2)
	{
		System.out.println((int)(java.lang.Math.pow(num1,num2)));

	}
	static void Powerdouble(double num1,int num2)
	{
		System.out.println("Result ="+java.lang.Math.pow(num1,num2));
	}
	public static void main(String[] args) {
		Calculator.Powerint(3,2);
		Calculator.Powerdouble(3.2,4);
	}
}
