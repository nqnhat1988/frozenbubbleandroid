package alax

import io.alax.sdk.pay.model.Asset
import org.jfedor.frozenbubble.BuildConfig

import java.math.BigDecimal

object Constant {
  const val DCORE_URL = "http://stagesocket.decentgo.com:8090/"

  val RECEIVER_ACCOUNT: String
    get() = if (BuildConfig.DEBUG) "alx-customer-6aa12c1a-3d3d-4bec-98d8-cb1b49f036f7" else ""

  val ASSET: Asset
    get() = if (BuildConfig.DEBUG) Asset.valueOf("ALAT") else Asset.valueOf("AIA")

  val PRICE = BigDecimal.valueOf(0.01)
}