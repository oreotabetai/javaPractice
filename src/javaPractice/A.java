package javaPractice;

//���̃N���X�̕ϐ���B��C�ɓn��
public class A implements ValueOwner {
	private int value = 3;

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();

		a.setValue(4);
		a.setSharers(b, c);
		//B��C�Œl��ς���
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

	//	ValueSharer�C���^�[�t�F�[�X�Ȃ��̈��������ׂẴN���X��,�q�̒��g���g����
	@Override
	public void setSharers(ValueSharer... sharers) {
		for (ValueSharer sharer : sharers) {
			sharer.setOwner(this);
		}
	}
}
