package com.nurlanamirzayeva.imtahansuallri.Question10


    import java.util.*
    import kotlin.math.sqrt

    fun main() {

        val scanner= Scanner(System.`in`)
        var a= scanner.nextDouble()
        var b= scanner.nextDouble()
        var c= scanner.nextDouble()
        var x:Double=1.0


        val equation:Double=a*x*x+b*x+c
        var determinant=b*b-4*a*c
        val root1:Double=(-b+sqrt(determinant))/(2*a)
        val root2:Double=(-b- sqrt(determinant))/(2*a)
        val root3:Double=((-b)/(2*a))

        fun sqrt(determiant: Double): Double{
            return determiant
        }

        if(a!==0.0 ){


            if(determinant>0.0){

                println(root2)
                println(root1)

            }

            else if(determinant<0.0){

                println("Roots are complex and different")
            }

            else if(determinant==0.0) {

                println(root3)
            }

        }
        else{

            println("a can not be equal to 0")
        }


    }
