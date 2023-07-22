package com.nurlanamirzayeva.imtahansuallri.Question2

interface Payment {
    fun payCard(){
        //Process credit card payment
    }

    fun payPal(){
        //Process PayPal payment
    }
    fun unknown(){
        //Unknown payment type
    }
}