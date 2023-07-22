package com.nurlanamirzayeva.imtahansuallri.Question1

class SumFacade(
    private var printStudentInformation1: PrintStudentInformation,
    private var calculateGrades1: CalculateGrades

)
{

    fun calculateGrades(student: Student){
        calculateGrades1.calculateGrades(student)

    }

    fun printStudentInformation(student: Student){
        printStudentInformation1.printStudentInformation(student)

    }
}