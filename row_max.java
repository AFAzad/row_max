/* 
Problem Statement
Given a boolean matrix of size N*M in which each row is sorted your task is to print the index of the row containing maximum 1's. If multiple answer exist print the smallest one. */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
int c=sc.nextInt();
int[][] mat = new int[r][c];

     for(int i=0;i<r;i++)
     { 
      for(int j=0;j<c;j++)
      { 
          mat[i][j] = sc.nextInt();
     }
 }
 int max=0;
 int row=0;
for(int i=0;i<r;i++)
     { 
         int sum=0;
      for(int j=0;j<c;j++)
      { 
          sum+=mat[i][j];
     }
     if (sum>max)
     {
         max=sum;
         row=i;
     }
 }
System.out.println(row);
    }
}