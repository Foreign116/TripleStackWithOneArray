
public class 3stack1array {
	private Node stack[];
	private int fsi;
	private int fse;
	private int ssi;
	private int sse;
	private int tsi;
	private int tse;
	private int f;
	private int s;
	private int t;

	public 3stack1array(int stacksize) {
		stack = new Node[stacksize * 3];
		int size = (stacksize * 3) / 3;
		fsi = f = 0;
		fse = size - 1;
		ssi = s = size;
		sse = (2 * size) - 1;
		tsi = t = (2 * size);
		tse = (3 * size) - 1;
	}

	public void push(Node n, int ws) {
		if (ws == 1) {
			if (f == (fse + 1)) {
				System.out.println("Can't Add anymore");
			} else {
				stack[f] = n;
				f++;
			}
		} else if (ws == 2) {
			if (s == (sse + 1)) {
				System.out.println("Can't Add anymore");
			} else {
				stack[s] = n;
				s++;
			}
		} else if (ws == 3) {
			if (t == (tse + 1)) {
				System.out.println("Can't Add anymore");
			} else {
				stack[t] = n;
				t++;
			}
		}
	}

	public int pop(int ws) {
		int top = 0;
		if (ws == 1) {
			top = stack[f-1].data;
			stack[f] = null;
			f--;
		} else if (ws == 2) {
			top = stack[s-1].data;
			stack[s] = null;
			s--;
		} else if (ws == 3) {
			top = stack[t-1].data;
			stack[t] = null;
			t--;
		}
		return top;
	}

	public int peek(int ws) {
		int top = 0;
		if (ws == 1) {
			top = stack[f-1].data;
		} else if (ws == 2) {
			top = stack[s-1].data;
		} else if (ws == 3) {
			top = stack[t-1].data;
		}
		return top;
	}

	public boolean isempty(int ws) {
		if (ws == 1 && f == 0) {
			return true;
		} else if (ws == 2 && s == (sse + 1)) {
			return true;
		} else if (ws == 3 && t == (tse + 1)) {
			return true;
		}
		return false;
	}

}
