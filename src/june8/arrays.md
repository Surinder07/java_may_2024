## Problems 
1. Given array , int[] arr = {10,20,30,40,50};

print the reverse of array. 

OP : 50  40 30 20 10 


2. Reverse this array 

0       1    2     3     4 
 10    20    30    40    50     ... 



50  40  30  20  10 

swap : 

 x = 10
 y = 20

y = 10 
x = 20


loop throught 
while (firstIndex < lastIndex) {
temp = arr[lastIndex]
arr[lastindex] = arr[firstIndex]
arr[firstIndex] = temp

firstIndex++;
lastIndex--;

}


temp = x ;
x = y;   // x = 20 
y = temp;   // y = 10 




3. Write a method which accepts array and return the maximum element in the array
or
 write a method which accepts array and print the maximum element 
 minimum element in array 






