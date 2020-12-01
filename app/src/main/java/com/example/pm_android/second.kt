package com.example.pm_android

fun main(){
    val range1 = 3..100 step 3
    val range2 = 5..100 step 5

    for (i in range1){
        println("i = $i Piff")
    }

    for (i in range2){
        println("i = $i Paff")
    }
}