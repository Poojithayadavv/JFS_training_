import java.util.*;
import java.util.stream;
public class IDimArray{
	public static void main(String args[]){
		int i[]=new int[5];
		i[0]=1;i[1]=2;i[2]=3;i[3]=4;i[4]=5;
		//dynamic
		int[] j={5,2,1,4,3};
		//accessing values from the array
		//using length and index
		int len=i.length;
		for(int k=len-1;k>=0;k--){
            if(k==2){
				continue;
			}else{
			System.out.print(i[k]+" ");
			}
		}
		System.out.println();
		//using for-each loop
		//for-each: indefinite loop, for - definite loop
		for(int k : j){
			System.out.print(k+" ");
		}
		System.out.println();
		
		
		//using streams
		Arrays.stream(j)
		.sorted()
		.forEach(System.out::println);
		}
	}
	