package alax

interface AlaxSDK {
  fun checkLicense(): LicenseEnum

  fun callPaidAction()
}