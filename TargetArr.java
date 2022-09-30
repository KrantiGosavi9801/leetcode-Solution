import java.util.*;
class TargetArr
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int i;
	System.out.println("Enter the size of the array:");
	int n=sc.nextInt();
	
	int nums[]=new int[n];
	System.out.println("Enter the array element:");
	for(i=0;i<n;i++)
	{
		nums[i]=sc.nextInt();
	}
	System.out.println("Enter the target value:");
	int target = sc.nextInt();
	
	for(i=0;i<nums.length;i++)
	{
		for(int j=i+1;j<nums.length;j++)
		{
			if(nums[i]+nums[j]==target)
			{
				System.out.println(i);
				System.out.println(j);
			}
		}
	}



   }
}