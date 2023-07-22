package com.nurlanamirzayeva.imtahansuallri.Question2

fun main(){


    val storeService= StoreService()

    storeService.unknown(PayUnknown())
    storeService.payCard(PayCardManager())
    storeService.payPal(PayPalManger())


}