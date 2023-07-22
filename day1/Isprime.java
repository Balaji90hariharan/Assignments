package week1.day1;

public class Isprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
int n=7;
int count =0;

for(a=2;a<n/2;a++)
{
	if(n % 1 ==0)
	{
	count=1;
}
}
	if(count ==0)
			{
		System.out.println("The number is Prime Number");
			}
	else
	{
		System.out.println("The number is not a Prime Number");
	}

	}

}
