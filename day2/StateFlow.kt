package com.example.channel.day2

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

suspend fun main(): Unit = coroutineScope {

    val stateFlow = MutableStateFlow(0)

    launch {
        stateFlow.collect{
            println(it)
        }
    }

    stateFlow.emit(1)
    stateFlow.emit(2)
    stateFlow.emit(3)
    delay(1000)
    stateFlow.emit(4)
    stateFlow.emit(5)
    stateFlow.emit(6)
    stateFlow.emit(3)

//    launch {
//        stateFlow.collect{
//            println(it)
//        }
//    }

}