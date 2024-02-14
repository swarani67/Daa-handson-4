The given fibonacci recursive function for fib(5) calls the another function as follows
In the first step fib(5) calls fib(4) and fib(3) then moves to next step
Here fib(4) calls fib(3) and fib(2)
Then fib(3) calls fib(2) and fib(1)
After fib(3) it goes to fib(2) and calls fib(1) and fib(0)
the final step to call the function is fib(1) and fib(0)
then the fibonacci function calculates as shown in below 
as we know fib(0)=0 and fib(1)=1 then
fib(2) evaluated as fib(1) + fib(0) = 1 + 0 = 1
fib(3) evaluated as fib(2) + fib(1) = 1 + 1 = 2
fib(4) evaluated as fib(3) + fib(2) = 2 + 1 = 3
fib(5) evaluated as fib(4) + fib(3) = 3 + 2 = 5





Problem -1

1.code is in the folder named problem1.java
2.Time complexity: To build the priority queue with size n it takes time as O(logk), so to pass the elements to the priority 
 queue it takes 
  O(k*logk). Then for merging arrays since we have total elements as k*n, so for each removal and addition of elements it 
  takes O(k*n*logk).
3.To improve time complexity: Instead of using priority queue can be use divide and conquer whic is a similar approach to 
  merge sort, and also can be 
  optimize the priority queue for the large number of elements in the array so that we can get the time complexity as 
  O(n*logK).



Problem-2
1. code is in the folder named as problem2.java
2. Time complexity: for reading the input from user it takes O(1)times which is a constant. Then to iterate the loop it takes O(n) times to read the elements in the array. For removing the duplicates it takes time as O(n). so overall time complexity for the code is O(n)+O(1) so it can be O(n).
3. To improve time complexity: By using hashset the time complexity can be improved it can be reduce to O(n) for removing the duplicates in the array where n is the size of an array.
