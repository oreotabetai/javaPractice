package javaPractice;

public class B implements ValueSharer{
	//インターフェース
	 private ValueOwner owner;
	 private int valueB;

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
}
