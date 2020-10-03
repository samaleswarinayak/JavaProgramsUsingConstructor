/* DEFINE A CLASS StudentDemo HAVING DATA MEMBER NAME,ROLL_NO, MARKS AND SIC_NO USING CONSTRUCTOR */

class StudentDemo
{
	int roll;
	float mark;
	String name,sic;
	StudentDemo(String name1,int roll1, String sic1,float mark1)
	{
		name= name1;
		roll=roll1;
		mark=mark1;
		sic=sic1;	
	}
	void show()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
		System.out.println("Mark: "+mark);
		System.out.println("SIC: "+sic);				
	}
}
class StudentDemoConstructor
{
	public static void main(String args[])
	{
		StudentDemo ob = new StudentDemo("Samaleswari",31,"FCS11658",85.6f);
		ob.show();
	}
}
