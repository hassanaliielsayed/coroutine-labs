package com.example.channel.day1

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun main()  {

    //val channel = Channel<String>()
    val listOfNames = listOf("7zn", "3wida", "ZoZ", "Yousef", "Mostafa")

    runBlocking {  }

    // sender - producer
//    GlobalScope.launch{
//
//        for (name in listOfNames){
//            delay(1000)
//            channel.send(name)
//        }
//        channel.close()
//    }

    // receiver // consumer

//    for (nameReceived in channel){
//        println(nameReceived)
//    }

    getName().consumeEach {
        println(it)
    }




}


fun getName() = GlobalScope.produce<String> {

    val listOfNames = listOf("Kero", "7zn", "3wida", "ZoZ", "Yousef", "Mostafa")

    for (name in listOfNames){
        delay(1000)
        send(name)  // == channel.send(name)

    }
    close()
}