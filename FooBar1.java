package fooBar;

import java.util.Arrays;

class Solution {
    public static int solution(int[] x, int[] y) {
       Arrays.sort(x);
       Arrays.sort(y);
       if(x[0]!=y[0]){
           return x[0]<y[0]?x[0]:y[0];
           //if the start number is different,
           //return the small one.
       }

       if(x[x.length-1]!=y[y.length-1]){
           return x[x.length-1]<y[y.length-1]?x[x.length-1]:y[y.length-1];
        //if the last number is different,
          //return the small one.
       }
       
    //under assumption that the initial number is the same
    //under assumption that the last number is the same
       int x_idx=0;
       int y_idx=0;
       while(true){
           int x_piv=x[x_idx];
           int y_piv=y[y_idx];
           while(x[x_idx]==x_piv){
               x_idx++;
           }
           while(y[y_idx]==y_piv){
               y_idx++;
           }
           
           if(x[x_idx]!=y[y_idx]){
                return x[x_idx]<y[y_idx]?x[x_idx]:y[y_idx];
           }
       }
    }
}

public class FooBar1 {

	public static void main(String[] args) {
		//int[] x= {13, 5, 6, 2, 5};
		//int[] y={5, 2, 5, 13};
		int[] x={14, 27, 1, 4, 2, 50, 3, 1};
		int[] y={2, 4, -4, 3, 1, 1, 14, 27, 50};
		Arrays.sort(x);
		Arrays.sort(y);
		Solution s=new Solution();
		System.out.println(s.solution(x,y));
	}

}
