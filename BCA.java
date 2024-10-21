
class BCA
{
int id;
String name;
String phonenumber;
int fees;
public static void main (String[]args)
{
	BCA s1=new BCA();
	BCA s2=new BCA();
	BCA s3=new BCA();
	s1.id=101;
	s2.id=102;
	s3.id=103;
	s1.name="Saketh";
	s2.name="Chinnu";
	s3.name="Bhanu";
	s1.phonenumber="6305001472";
	s2.phonenumber="8096378654";
	s3.phonenumber="9160051777";
	s1.fees=10;
	s2.fees=20;
	s3.fees=30;
	System.out.println(" ID	NAME	PH NUMBER	FEES");
	System.out.println(s1.id+"	"+s1.name+"	"+s1.phonenumber+"	"+s1.fees);
	System.out.println(s2.id+"	"+s2.name+"	"+s2.phonenumber+"	"+s2.fees);
	System.out.println(s3.id+"	"+s3.name+"	"+s3.phonenumber+"	"+s3.fees);

}
}