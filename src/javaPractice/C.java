package javaPractice;

public class C implements ValueSharer {
	private ValueOwner owner;

	@Override
	public void setOwner(ValueOwner owner) {
		this.owner = owner;
	}

	@Override
	public int getValue() {
		return owner.getValue();
	}

	@Override
	public void setValue(int value) {
		owner.setValue(value);
	}

	public void p() {
		int c = owner.getValue();
		System.out.print(c);
	}
}
