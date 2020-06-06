# Palindrome

A word, phrase, or sequence of number that reads the same backwards as forwards, e.g. 454 or 353.

## Question

Write a program which checks if a number is palindrome or not.

## Description
Takes a number, reverses it and checks if the reversed number is the same as the original given number.

## Core Logic to get the reverse of the number

```java
n = givenNumber
while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;
   n=n/10;    
  } 
```

## Check for palindrome

```java
if(givenNumber==reversedNumber)    
   System.out.println("Palindrome number");    
else    
   System.out.println("Not palindrome"); 
```


## Author
Madhushree Singh