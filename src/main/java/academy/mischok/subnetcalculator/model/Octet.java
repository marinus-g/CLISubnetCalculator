package academy.mischok.subnetcalculator.model;

public abstract class Octet {

    private final String value;
    private final  int index;
    protected int integerValue;

    protected Octet(String value, int index) {
        this.value = value;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getIntegerValue() {
        return integerValue;
    }

    public String getValue() {
        return value;
    }
}