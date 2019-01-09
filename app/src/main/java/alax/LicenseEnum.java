package alax;

public enum LicenseEnum {
    UNPAID(0),
    PAID(1);


    private int intValue;

    LicenseEnum(int i) {
        intValue = i;
    }

    public int getIntValue() {
        return intValue;
    }
}
