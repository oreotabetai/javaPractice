package javaPractice;

//このクラスの変数をBとCに渡す
public class A implements ValueOwner {
	private int value = 3;

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();

		a.setValue(4);
		a.setSharers(b, c);
		//BとCで値を変える
		b.p();
		c.p();

	}

	@Override
	public int getValue() {
		return value;
	}

	@Override
	public void setValue(int value) {
		this.value = value;

	}

	//	ValueSharerインターフェースないの引数をすべてのクラスに,子の中身が使える
	@Override
	public void setSharers(ValueSharer... sharers) {
		for (ValueSharer sharer : sharers) {
			sharer.setOwner(this);
		}
	}
}
