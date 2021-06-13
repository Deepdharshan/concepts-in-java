import java.util.*;
public class ParanthesisBalancing{
	
	public static void main(String []args){
		int top=-1;
		String s="(()([)])";
		int n=s.length();
		char a[]=new char[n];
			for(int i=0;i<n;i++){
			char j=s.charAt(i);
			if(j=='(' || j=='['){
				 ++top;
				a[top]=j;
				
			}
			else if(j==')' || j==']'){
				if(s.charAt(i)==')'){
					a[top]=')';
					--top;
					
				}
				else{
					if(a[top]=='('){
						System.out.println("Unbalanced");
						break;
					}	
					else{
						--top;
					}
				}
				
			}
		}
	    if(top==-1)
			System.out.println("balanced");			
		
	}
}