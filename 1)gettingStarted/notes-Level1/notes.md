- Priority of Operators(for same priority operations are done from left to right)
    - * / % (multiply,divide,modulus have same level of priority )
    - + -  (plus , minus has same level of priority)
- Use bracket to set pririoty.
- xy/x+y is not same as xy/(x+y) where x,y could be any value
- Conditionals ==> https://stackabuse.com/java-flow-control-if-and-if-else-statements/
- in else-if statements, order is critical
  ```java

  int age = 15;

  if(age>50){
    System.out.println("getting old");
  }else if(age>18){
    System.out.println("young");
  }else if(age<18){
    System.out.println("teens");
  }else{
    System.out.println("just born");
  }

  // we expected the program to print teen, but the first condition found true(15>50) so it printed "getting old" 

  // if we reverse the order of else-if condition we will get the correct result.

  ``` 

- Loops in Java
```text
  for loop
  labeled for loop ==> useful when to break/continue any one of labeled for loop that mention in the code 

  for each loop (used to iterate over an collections)
    for(data_type variable : array_name){    
      //code to be executed    
    }
    for (type variableName : arrayName) {
      // code block to be executed
    }
  
  int arr[]={12,23,44,56,78};  
  //Printing array using for-each loop  
  for(int i:arr){  
    System.out.println(i);  
  }  

  while loop
  do-while loop


  - If the number of iteration is fixed, it is recommended to use "for loop".Else use "while loop"
```


Taking Input via Scanner class in Java
http://www.cs.utsa.edu/~cs1063/lectures/Scanner.html
https://www.jigsawacademy.com/blogs/java/scanner-class-in-java/


| Method        | Data Type | Description                                        |   |   |
|---------------|-----------|----------------------------------------------------|---|---|
| nextInt()     | Int       | It takes int type input value from the user.       |   |   |
| nextFloat()   | Float     | It takes a float type input value from the user.   |   |   |
| nextBoolean() | Boolean   | It takes a boolean type input value from the user. |   |   |
| nextLine()    | String    | It takes a line as an input value from the user.   |   |   |
| next()        | String    | It takes a word as an input value from the user.   |   |   |
| nextByte()    | Byte      | It takes a byte type of input value from the user. |   |   |
| nextDouble()  | Double    | It takes a double type input value from the user.  |   |   |
| nextShort()   | Short     | It takes a short type input value from the user.   |   |   |
| nextLong()    | Long      | It takes a long type of input value from the user. |   |   |


- While taking both String and Integer type(in general two different data types) input in the same program, we can only use "scn.nextLine", we need to convert the string into int using Integer.parseInt()
- We cannot use scn.nextInt() and scn.nextLine() in the same program, it results in an error.(it results in ERROR ONLY WHEN the integer input is taken first using scn.nextInt() and then we take string input using scn.nextLine(); if we take the string input first and then the integer input it doesn't causes any problem).

```java
  Scanner scn = new Scanner(System.in);
  //causes problem // solution use nextLine() and Integer.parseInt() to convert it into integer
  int n = scn.nextInt();
  String name = scn.nextLine();
  
  //works fine
  String name = scn.nextLine();
  int n = scn.nextInt();

```

  ```java
     int n = Integer.parseInt(scn.nextLine());
  ```

  ## Topic to cover the basics of any Programing Language
  ```notes
  - Taking Input
  - Displaying output
  - variable 
  - conditions (if else else-if ternary )
  - loops (if while do-while forEach )
  - SOLVE LOT OF PROBLEMS
  ```

# isPrimeOrNot
- All the unique factors of an number can be found from 1 till square root of that number.
- if pq = n then [ p > sqRoot(n) && q > sqRoot(n) ] at the same time is NOT true.
  ![](images/Screenshot%20from%202022-07-16%2007-35-32.png)