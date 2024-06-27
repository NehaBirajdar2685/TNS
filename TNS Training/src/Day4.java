
public class Day4 {
	public static void main(String[] args) {
		/*int a=10;
		int b=20;
		int c=10;
		
		System.out.println("a and b value before the operator:"+a+" "+b);
		
		++a;
		int x=++a+b+a--;
		System.out.println("x value after the operators :"+x);
		
		int d=x++ +a +b--;
		System.out.println("d value after the operator:"+d);
		
		*/
		
//CONTROL STATEMENT
		
		
//if else statement
		/*int age=9;
		if (age>=18)
{
			System.out.println("YOU ARE ELIGIBLE FOR VOTING");
}
		else {
			System.out.println("YOU ARE  NOT ELIGIBLE FOR VOTING");
			
		}*/
		
		
		
//DECISION MAKING STATEMENT
		/*int x=8,y=7;
		int a=10;
		int b=11;
		
		if (x>=y) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		if (!(a<b)||(a==b)) {
			System.out.println("Condition is True");
		}
		else {
			System.out.println("Condition is False");
		}*/
		
		
		
//NASTED IF ELSE statement
		
		/*int a=10, b=20, c=5;
		System.out.println("The largest No is:");
		if (a>b) {
			if (a>c)
				System.out.println(a);
			
			else
				System.out.println(c);
				
		}
		else {
			if (c>b)
				System.out.println(c);
			else
				System.out.println(b);
		}*/
		
		
//FOR LOOP
		/* for (int i=1;i<=100; i++) {
			 System.out.println("A value of i:"+i);
		 }*/
		
		
//WHILE LOOP
		/*int i=99;
		while(i<=100) {
			System.out.println(i);
			i++;
		}*/
		
		
//DO WHILE LOOP
		/*int i=11;
		do {
			System.out.println(i);
			i++;
		}
		while(i<=1);*/
		
		
//FOR EACH LOOP
		/*int a[]= {10,20,30,40,50};
		
		 //for integer aaray
		for(int i:a) {
			System.out.println(i);
		}
		char ch[]= {'i','j','k','l'};
		for (char c:ch)
		{
			System.out.println(c);
		}
		String s1[]= {"NEHA","ASMITA","SHWETA"};
		for(String s:s1)
		{
			System.out.println(s);
		}*/
		
		
//NESTED FOE LOOP
		 //program to print the multiplication tables
		 //in a given range by using nested for loop
		/*int beg=10;
		int end=20;
		
		for(int i=beg; i<=end; i++ )
		{
			for (int j=1;j<=10;j++)
			{
				System.out.println(i + "*" +j+"="+i*j);
			}
			
		}*/
		
		
//SWITCH 
		/*char x='l';
		switch(x)
		{
		case 'l':
		case 'L':
			System.out.println(x + " is a leader");
			break;
			
		case 'd':
		case 'D':
			System.out.println(x + " is a Digit");
			break;
		
		
		}*/
		
		
//BREAK 
		/*for(int i=5;i<10;i++) {
			if(i==5) {
				System.out.println(i);
				break;
			}
		}*/
		
		
		
// Continue
		for(int i=5;i<15;i++) {
			if(! (i%2==0)) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
