package javaPractice;

//���̃N���X�̕ϐ���B��C�ɓn��
public class A implements ValueOwner {
	private static int value = 3;

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();

		a.setValue(value);
		System.out.print(a.getValue());
		b.p();;

		a.setSharers(b, c);

	}

	@Override
	public int getValue() {
		return value;
	}

	@Override
	public void setValue(int value) {
		this.value = value;

	}

	//	ValueSharer�C���^�[�t�F�[�X�Ȃ��̈��������ׂẴN���X��
	@Override
	public void setSharers(ValueSharer... sharers) {
		for (ValueSharer sharer : sharers) {
			sharer.setOwner(this);
		}
	}
}
