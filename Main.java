import java.util.*;
public class Main{
	public static void main(String args[]){
		//oddoreven(10);
		//checkPrime(1);
		//factorial(4);
		//reverse(741258);
		//palindrome(17412852);
		//sumOfDigits(741258);
		//armstrongNumber(153);
		//count(741258);
		//gcd(15,75);
		//lcm(12,16);
		//perfectNum(12);
		//strongNum(155);
		//oddOrEvenBit(7);
		//swapping(7,8);
		//oddOrEvenShift(8);
		//octalAddition(48,62);
		binaryAddition(01,11);
		//hexaAddition();
}
	static void oddoreven(int n){
		if(n%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
	}


	static void checkPrime(int n){
		
		Boolean result=true;
		if(n<=1){
			result=false;
		}
		for(int i=2;i<n;i++){
			if(n%i==0){
				result=false;
				break;
			}
		}	
		if(result)
		System.out.println("Prime");
		else
		System.out.println("Not Prime");
}

	static void factorial(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
			fact*=i;}
		System.out.println(fact);
}
	static void reverse(int n){
		int temp=n;
		int rev=0;
		while(temp>0){
			rev=rev*10+(temp%10);
			temp/=10;
			}
		System.out.println(rev);
		}
	static void palindrome(int n){
		int temp=n;
		int rev=0;
		while(temp>0){
			rev=rev*10+(temp%10);
			temp/=10;
			}
		if(rev==n)
			System.out.println("palindrome");
		else
			System.out.println("Not a palindrome");

		}

	static void sumOfDigits(int n){
		int temp=n;
		int sum=0;
		while(temp>0){
			sum+=(temp%10);
			temp/=10;
			}
		System.out.println(sum);
}
		
	static void count(int n){
		int result=0,temp=n;
		while(temp>0){
			result++;
			temp/=10;}
		System.out.println(result);
}

	static void armstrongNumber(int n){
		int result=0,temp=n,temp2=n,val=0;
		while(temp>0){
			temp/=10;
			result++;}
		while(temp2>0){
			int rem=temp2%10;
			val=val+(int)Math.pow(rem,result);
			temp2/=10;
			}
		if(val==n)
			System.out.println("Armstrong");
		else
			System.out.println("Not a Armstrong");
}
	static void gcd(int n1,int n2){
		int smallest=(n1<n2)?n1:n2;
		for(int i=smallest;i>1;i--){
			if(n1%i==0&&n2%i==0){
				System.out.println("gcd is: "+i);
				break;}
		}
}

	static void lcm(int n1,int n2){
		int greatest=(n1>n2)?n1:n2;
		while(true){
			if(greatest%n1==0&&greatest%n2==0){
				System.out.println("LCM is: "+greatest);
				break;}
			greatest++;
		}
}
	static void perfectNum(int n){
		int sum=0;
		for(int i=1;i<=n/2;i++){
			if(n%i==0)
				sum+=i;}
		if(n==sum)
			System.out.println("Perfect Number");
		else
			System.out.println("Not perfect");
}

	static void strongNum(int n){
		int temp=n;
		int sum=0;
		while(temp>0){
			int rem=temp%10;
			temp/=10;
			int fact=1;
			for(int i=1;i<=rem;i++){
				fact*=i;
				}
			sum+=fact;}
		if(sum==n)
			System.out.println("Strong Number");
		else
			System.out.println("Not a Strong number");
}

	static void oddOrEvenBit(int n){
		if((n&1)==1)
			System.out.println("odd");
		else
			System.out.println("Even");
}

	static void swapping(int a,int b){
		System.out.println("a: "+a);
		System.out.println("b: "+b);

		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
}

	static void oddOrEvenShift(int n){
		int temp=n;
		temp=temp>>1;
		temp=temp<<1;
		if(n==temp)
			System.out.println("even");
		else
			System.out.println("odd");
}
static void binaryAddition(int a,int b){
// int a = 11;
//int b = 11;
int rem1=0,rem2=0,carry=0;
String sum= "";
while(a>0){
rem1 = a%10;
rem2 =b%10;
if(rem1+rem2 == 2){
rem1=0;
rem2=0;
sum = rem1 +rem2+carry+sum;
carry=1;

}
else{
sum = rem1 +rem2+carry+sum;
carry=0;
}
a/=10;
b/=10;

}
if(carry!=0)
sum = carry+sum;
System.out.print(sum);	
}

	static void hexaAddition(){
		Scanner sc1=new Scanner(System.in);
		String a=sc1.nextLine();
		Scanner sc2=new Scanner(System.in);
		String b=sc2.nextLine();
		int carry=0;
		String output="";
		char letters[]={'A','B','C','D','E','F'};
		for(int i=a.length()-1;i>=0;i--){
			int num1=number(a.charAt(i));
			int num2=number(b.charAt(i));
			int sum=num1+num2+carry;
			int rem=sum%16;
			
			if(rem>=10 && rem<=15){
				int position=rem%10;
				char letter=letters[position];
				output=letter+output;
			}
			else{
				output=rem+output;
			}
			carry=sum/16;
		}
		System.out.print(output);
	}

	static int number(char x){
		int num=0;
		switch(x){
			case '0':
			num=0;
			break;
			case '1':
			num=1;
			break;
			case '2':
			num=2;
			break;
			case '3':
			num=3;
			break;
			case '4':
			num=4;
			break;
			case '5':
			num=5;
			break;
			case '6':
			num=6;
			break;
			case '7':
			num=7;
			break;
			case '8':
			num=8;
			break;
			case '9':
			num=9;
			break;
			case 'A':
			num=10;
			break;
			case 'B':
			num=11;
			break;
			case 'C':
			num=12;
			break;
			case 'D':
			num=13;
			break;
			case 'E':
			num=14;
			break;
			case 'F':
			num=15;
			break;
		}return num;
	}
}


	


