package com.example.pm_android

fun main(){
    for (i in 1..100){
        if(i % 3 == 0){
            println("i = $i Piff")
        }
        if (i % 5 == 0){
            println("i = $i Paff")
        }
    }
}
