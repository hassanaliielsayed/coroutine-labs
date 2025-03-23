package com.example.channel.day1

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

//producer
fun getNumbers() = flow<Int> {

    for (i in 1..10){
        delay(500)
        emit(i)
    }
}


suspend fun main(){

    getNumbers()
        .filter { it > 4 } // non terminal operator
        .map { it * 3 }
        .collect{
            println(it)
        } // consumer




}