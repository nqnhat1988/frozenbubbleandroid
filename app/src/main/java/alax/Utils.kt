package alax

import android.content.Context

object Utils {
  private const val paidSharedPref = "PAID_SHARED_PREF"

  private const val licenseSharedPref = "LICENSE"

  fun savePaidSharedPref(context: Context, value: LicenseEnum) {
    val sharedPreferences = context.getSharedPreferences(paidSharedPref, Context.MODE_PRIVATE)
    sharedPreferences.edit().putInt(licenseSharedPref, value.intValue).apply()
  }

  fun loadPaidSharedPref(context: Context): LicenseEnum {
    val sharedPreferences = context.getSharedPreferences(paidSharedPref, Context.MODE_PRIVATE)
    return LicenseEnum.values()[sharedPreferences.getInt(licenseSharedPref, 0)]
  }
}
