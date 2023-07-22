package com.nurlanamirzayeva.imtahansuallri.Question2

class StoreService {


    fun payCard(payment:Payment){
      payment.payCard()
    }

    fun payPal(payment: Payment){
        payment.payPal()

    }
    fun unknown(payment: Payment){
        payment.unknown()

    }
}