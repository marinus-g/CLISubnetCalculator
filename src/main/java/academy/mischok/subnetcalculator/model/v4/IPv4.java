package academy.mischok.subnetcalculator.model.v4;

import academy.mischok.subnetcalculator.exception.InvalidIp4Address;
import academy.mischok.subnetcalculator.model.IPAddress;

public class IPv4 extends IPAddress {

    private final IPv4Octet[] octets = new IPv4Octet[4];

    public IPv4(String address) throws InvalidIp4Address {
        super(address);
        String[] octetValues = address.split("\\.");
        for (int i = 0; i < octetValues.length; i++) {
            octets[i] = new IPv4Octet(octetValues[i], Integer.parseInt(octetValues[i]), i);
        }
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        for (IPv4Octet octet : octets) {
            builder.append(octet.getValue()).append(".");
        }
        return builder.toString();
    }
}