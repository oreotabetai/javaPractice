package javaPractice;

interface ValueAccessor {
	int getValue();
	void setValue(int value);
}

//ValueSharerを全部引数に持つ
interface ValueOwner extends ValueAccessor{
	void setSharers(ValueSharer... sharers);
}

//これをimplementする
interface ValueSharer extends ValueAccessor{
	void setOwner(ValueOwner owener);
}


