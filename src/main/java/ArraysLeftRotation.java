/*
https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
* A left rotation operation on an array shifts each of the array's elements  unit to the left.
For example,if left rotations are performed on array , then the array would become.
Given an array of integers and a number, perform  left rotations on the array. Return the updated array
to be printed as a single line of space-separated integers.

Function Description:
It should return the resulting array of integers.
The method should have the following parameter(s):
- An array of integers
- An integer (the number of rotations)

Input Format:
The first line contains two space-separated integers:
- n: size of tha array
- d: number of left rotations
The second line contains  space-separated integers .

Constraints:
- 1 <= n <= 10^5
- 1 <= d <= n
- 1 <= a[i] <= 10^6

Output Format:
Print a single line of  space-separated integers denoting the final state of the array after performing left rotations.

Sample Input:
5 4
1 2 3 4 5

Sample Output:
5 1 2 3 4

* */

public class ArraysLeftRotation {

    public static int[] arraysLeftRotation(int[] a, int d) {
        int result [] = new int [a.length];
        int aux = 0;

        for (int i = 0; i < d; i++){
            for (int j=0; j< a.length-1; j++){
                if(j == 0) aux = a[0];
                result[j] = a[j+1];
            }
            result[a.length-1] = aux;
            a = result;
        }
        return result;
    }
}
