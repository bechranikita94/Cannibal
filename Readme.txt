Problem:
Imagine a given set of numbers wherein some are cannibals. We define a cannibal as a larger number can eat a smaller number and increase its value by 1. There are no restrictions on how many numbers any given number can consume. A number which has been consumed is no longer available.

Sample Input:
7 2				// n and q
21 9 5 8 10 1 3			// n numbers
10 15				// q query inputs

Output: 
4 2				// The number of numbers which are equal to or greater than the desired query input

Algorithm:
1. User will input 'n' numbers. In this case n=7. 
2. It will then sort all the numbers in ascending order. So now the input number set will be {1, 3, 5, 8, 9, 10, 21}
3. Then it will take query input one by one and check for every numbers from the number set.
	If query input is greater than the number from the number set then the difference between the query input and the number set should be smaller or equal to the index of the sorted list and the count will increase by 1.
	If query input is smaller than the number from the number set then the count will increase by 1.

Some Scenarios: 
1. If there are repetition of numbers in the number set then all the repeated numbers will be considered once.
2. If user enters more numbers than the defined 'n' than the additional numbers will be considered as query input and if number of query input is greater than 'q' than all the additional numbers will be avoided.
