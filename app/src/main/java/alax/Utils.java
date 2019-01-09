package alax;

import android.content.Context;
import android.content.SharedPreferences;

public class Utils {
    private static String paidSharedPref = "PAID_SHARED_PREF";

    private static String licenseSharedPref = "LICENSE";

    public static void savePaidSharedPref(Context context, LicenseEnum value) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(paidSharedPref, Context.MODE_PRIVATE);
        sharedPreferences.edit().putInt(licenseSharedPref, value.getIntValue()).apply();
    }

    public static LicenseEnum loadPaidSharedPref(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(paidSharedPref, Context.MODE_PRIVATE);
        return LicenseEnum.values()[sharedPreferences.getInt(licenseSharedPref, 0)];
    }
}
