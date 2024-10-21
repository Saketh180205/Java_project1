
class BCA1
{
int id;
String name;
String phonenumber;
int fees;
public static void main (String[]args)
{
	BCA1 s1=new BCA1();
	BCA1 s2=new BCA1();
	BCA1 s3=new BCA1();
	BCA1 s4=new BCA1();
	BCA1 s5=new BCA1();
	s1.id=101;
	s2.id=102;
	s3.id=103;
	s4.id=104;
	s5.id=105;
	s1.name="Saketh";
	s2.name="Chinnu";
	s3.name="Pixel";
	s4.name="Srinu";
	s5.name="Rohith";
	s1.phonenumber="6305001472";
	s2.phonenumber="8096378654";
	s3.phonenumber="9160051777";
	s4.phonenumber="8096456654";
	s5.phonenumber="9160345777";
	s1.fees=10;
	s2.fees=20;
	s3.fees=30;
	s4.fees=40;
	s5.fees=50;
	System.out.println(" ID	NAME	PH NUMBER	FEES");
	System.out.println(s1.id+"	"+s1.name+"	"+s1.phonenumber+"	"+s1.fees);
	System.out.println(s2.id+"	"+s2.name+"	"+s2.phonenumber+"	"+s2.fees);
	System.out.println(s3.id+"	"+s3.name+"	"+s3.phonenumber+"	"+s3.fees);
	System.out.println(s4.id+"	"+s4.name+"	"+s4.phonenumber+"	"+s4.fees);
	System.out.println(s5.id+"	"+s5.name+"	"+s5.phonenumber+"	"+s5.fees);

}
}