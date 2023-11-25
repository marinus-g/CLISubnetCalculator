package academy.mischok.subnetcalculator.model.v4;

import academy.mischok.subnetcalculator.model.Octet;

public class IPv4Octet extends Octet {

    public IPv4Octet(String value, int integerValue, int index) {
        super(value, index);
        super.integerValue = Integer.parseInt(value);
    }
}