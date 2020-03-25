
public class Triangle {
	public boolean judgeEdges(int a, int b, int c) {
		boolean ans = true;
		if(a<=0 || b<=0 || c<=0) return false;
		if(a+b<=c) ans = false;
		if(a+c<=b) ans = false;
		if(b+c<=a) ans = false;
		return ans;
	}
}
