public class QuickSort{
 public static int[]  Change(int[] a) {
    	int i = 1;
    	int j = a.length-1;
    	int key = a[0];
    	while((j-i)!=1) {
    	    if(a[i]<key) {
    			i++;
    		}
    	    if(a[j]>key) {
    			j--;
    		}
    		if(a[i]>key&&a[j]<key) {
    			int tmp = a[j];
    			a[j] = a[i];
    			a[i] = tmp;
    		}	
    	}
    	int tmpt = a[0];
    	a[0] = a[i-1];
    	a[i-1] = tmpt;
    	return a;
     }
    public static void print(int[] a) {
    	for(int i = 0;i<a.length;i++) {
    		System.out.print(a[i]+",");
    	}
    }
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a = {1,-3,4,24,2,5,3,5,-1};
        print(Change(a));
	}

}


