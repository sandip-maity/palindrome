// Program in Java to check if a program is palindrome or not


class PalindromeExample{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=454;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    //Condition to check if original number is same
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  