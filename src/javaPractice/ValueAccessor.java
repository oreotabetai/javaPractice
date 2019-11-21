package javaPractice;

interface ValueAccessor {
	int getValue();
	void setValue(int value);
}

//ValueSharer‚ğ‘S•”ˆø”‚É‚Â
interface ValueOwner extends ValueAccessor{
	void setSharers(ValueSharer... sharers);
}

interface ValueSharer extends ValueAccessor{
	void setOwner(ValueOwner owener);
}


