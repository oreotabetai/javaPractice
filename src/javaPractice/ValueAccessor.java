package javaPractice;

interface ValueAccessor {
	int getValue();
	void setValue(int value);
}

//ValueSharer��S�������Ɏ���
interface ValueOwner extends ValueAccessor{
	void setSharers(ValueSharer... sharers);
}

//�����implement����
interface ValueSharer extends ValueAccessor{
	void setOwner(ValueOwner owener);
}


