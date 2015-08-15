package algorithm.pasring;

import java.util.Stack;


public class StringExpParsing {

	public static void main(String arg[]){
		
		String test_string = "3+5+[3*2/(1+2)]*3^2";
		Operation.compute(test_string);
		
	}
	
}

class Operation{
	
	public static void compute(String str){
		
		Stack<String> s = new Stack<String>();
		String [] data =transfer(str);
		
		for (int i=0;i<data.length;i++)
			System.out.print(data[i]);
		
		System.out.println();
		
		for(int i = 0 ; i < data.length ; i++){
			
			if(data[i] == null)break;

			if(data[i].equals("+")||data[i].equals("-")||data[i].equals("*")||data[i].equals("/")||data[i].equals("^")){
				
				int b = Integer.parseInt(s.pop());
				int a = Integer.parseInt(s.pop());
				if(data[i].equals("+"))
					s.push(""+(a+b));
				else if(data[i].equals("-"))
					s.push(""+(a-b));
				else if(data[i].equals("*"))
					s.push(""+(a*b));
				else if(data[i].equals("/"))
					s.push(""+(a/b));
				else if(data[i].equals("^"))
					s.push(""+(int)(Math.pow(a,b)));
				
			}else{
				s.push(data[i]);
			}
				
		}
		System.out.println("The answer is : "+s.pop());
	}
	
	public static String [] transfer(String data)
	{
		Stack<String> s = new Stack<String>();
		int index = 0;
		String [] ans = new String[data.length()];
		
		for(int i = 0 ; i < data.length() ;i++){
			
			String opr = returnSplit(data,i);
			if(opr.length() > 1) i+= (opr.length()-1);
			
			if(opr.equals("+")||opr.equals("-")||opr.equals("*")||opr.equals("/")||opr.equals("^")){
				
				while(s.size() != 0 && priority(opr) <= priority(s.peek())){
					ans[index++] = s.pop();
				}
				s.push(opr);
				
			}else if(opr.equals("(")){
				s.push(opr);
			}else if(opr.equals("[")){
				s.push(opr);
			}else if(opr.equals(")")){
				String tempS ="";
				while(s.size() > 0 &&!( (tempS = s.pop()).equals("(")) )
				{
					ans[index++] = tempS;
				}
			}else if(opr.equals("]")){
				String tempS ="";
				while(s.size() > 0 &&!( (tempS = s.pop()).equals("[")) )
				{
					ans[index++] = tempS;
				}
			}else{
				ans[index++] =opr;
			}
		}
		
		while(s.size()>0)ans[index++] = s.pop();
		return ans;
		
	}
	
	public static String returnSplit(String data,int index){
		String thisString ="";
		String s = String.valueOf(data.charAt(index));

		if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")||s.equals("(")||s.equals(")")||s.equals("[")||s.equals("]")||s.equals("^"))
		{
			return s;
		}
		else{
			do{
				thisString += s;
				if(index+1 ==data.length())break;
				s = String.valueOf(data.charAt(++index));
			}while(!s.equals("+")&&!s.equals("-")&&!s.equals("*")&&!s.equals("/")&&!s.equals("(")&&!s.equals(")")&&!s.equals("[")&&!s.equals("]")&&!s.equals("^"));
			return thisString;
		}
	}
	
	public static int priority(String opr){
		if(opr.equals("^"))return 3;
		else if(opr.equals("*")||opr.equals("/"))return 2;
		else if(opr.equals("+")||opr.equals("-"))return 1;
		else return 0;
	}
	
	
}
