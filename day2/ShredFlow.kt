package com.example.channel.day2

import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch

suspend fun main() : Unit = coroutineScope {

    val sharedFlow = MutableSharedFlow<Int>(replay = 3, onBufferOverflow = BufferOverflow.DROP_LATEST)
    //val sharedFlow = MutableSharedFlow<Int>(replay = 1)
    //val sharedFlow = MutableSharedFlow<Int>(replay = 1, onBufferOverflow = BufferOverflow.SUSPEND)


    launch {
        sharedFlow.collect{
            println("1 : $it")
        }
    }

    launch {
        sharedFlow.collect{
            println("2 : $it")
        }
    }

    sharedFlow.emit(1)
    sharedFlow.emit(2)
    sharedFlow.emit(3)
    sharedFlow.emit(4)
    sharedFlow.emit(5)
    sharedFlow.emit(6)
    sharedFlow.emit(7)
    sharedFlow.emit(8)
    sharedFlow.emit(9)
    sharedFlow.emit(10)
    sharedFlow.emit(11)
    sharedFlow.emit(12)
    sharedFlow.emit(13)
    sharedFlow.emit(14)
    sharedFlow.emit(15)
    sharedFlow.emit(16)
    sharedFlow.emit(17)
    sharedFlow.emit(18)
    sharedFlow.emit(19)
    sharedFlow.emit(20)

    launch {
        sharedFlow.collect{
            println("3 : $it")
        }
    }


}