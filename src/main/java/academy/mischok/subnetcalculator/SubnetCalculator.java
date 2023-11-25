package academy.mischok.subnetcalculator;

import academy.mischok.subnetcalculator.model.IPType;

import java.util.Scanner;

public class SubnetCalculator {

    private final Scanner scanner = new Scanner(System.in);
    private IPType currentType;

    public SubnetCalculator() {
        requestInput();
    }


    private void requestInput() {
        System.out.println("Please enter an IP address:");
        String input = scanner.nextLine();
        while (this.currentType == null) {
            this.currentType = getType(input);
            if (this.currentType == null) {
                System.out.println("You entered an invalid IP address. " +
                        "Please try again:");
                input = scanner.nextLine();
            }
        }
        System.out.println("You entered a valid " + currentType + " address.");
    }

    public IPType getType(String input) {
        if (this.matchesV6(input)) {
            return IPType.IPv6;
        } else if (this.matchesV4(input)) {
            return IPType.IPv4;
        } else {
            return null;
        }
    }

    private boolean matchesV6(String input) {
        String[] hextets = input.split(":");
        if (hextets.length > 8) return false;
        int countDoubleColon = input.length() - input.replace("::",
                "").length();
        if (countDoubleColon > 2) return false;
        return input.matches("^([0-9a-fA-F]{0,4}:){0,7}" +
                "(:[0-9a-fA-F]{0,4}){0,7}$");
    }

    private boolean matchesV4(String input) {
        return input.matches("^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$");
    }
}