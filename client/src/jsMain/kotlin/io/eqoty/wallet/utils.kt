package io.eqoty.wallet

import io.eqoty.secretk.wallet.AccountData
import io.eqoty.secretk.wallet.Algo
import org.khronos.webgl.Uint8Array
import org.khronos.webgl.get

fun jslibs.secretjs.AccountData.toCommonType(): AccountData =
    AccountData(
        address = address,
        algo = Algo.valueOf(algo),
        pubkey = pubkey.toUByteArray()
    )


fun Uint8Array.toUByteArray(): UByteArray {
    if (length.asDynamic() == undefined) {
        println("Error")
    }
    val result = UByteArray(length)
    for (i in 0 until length) {
        result[i] = get(i).toUByte()
    }

    return result
}