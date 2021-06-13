import java.util.*;
public class ParanthesisBalancing{
	
	public static void main(String []args){
		int top=-1;
		int count=0;
		String s="(a(a%b)+(aaa(a[h+k)";
		int n=s.length();
		char a[]=new char[n];
		char b[]=new char[2*n];
		for(int i=0;i<n;i++){
			char j=s.charAt(i);
			if(j=='(' || j=='['){
				 ++top;
				a[top]=j;
				b[count]=j;								
			}
			else if(j==')' || j==']'){
			 	
				if(j==')' && a[top]=='(')
					b[count]=j;														
				else if(j==']' && a[top]=='[')					
					b[count]=j;														
				else{
					if(a[top]=='(')
						b[count]=')';														
					else
						b[count]=']';	
					
				}
				--top;
				if(top!=-1)
					--i;		
			}
			if(j!=')' && j!=']')
				b[count]=j;
			count++;
		}
		
	    if(top==-1){			
			String st = String.copyValueOf(b, 0,b.length );
			System.out.println(s);
			System.out.println(st);
		}
	}
}