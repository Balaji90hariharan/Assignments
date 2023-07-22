package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int firstnumber =0;
int secondnumber =1;
int sum =0;

for(int i=0;i<=56;i++)
{
	sum=firstnumber+secondnumber;
	firstnumber=secondnumber;
	secondnumber=sum;
	if(i<=11)
	{
		System.out.println(sum);
	}

	} }

}
