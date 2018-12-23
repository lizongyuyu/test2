package day0601_test;

public class recorsion {
	public static void main(String[] args) {		
	int n = 5;
	int x =foo(n);
	System.out.println(x);
}
	//递归方法
	//消耗内存，所以空间消耗很大，当递归深度很大时，需要注意
	//递归并不总能转换为迭代方法
	public static int foo(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*foo(n-1);
		}
	}
}