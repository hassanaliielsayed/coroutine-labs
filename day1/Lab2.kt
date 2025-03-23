package com.example.channel.day1

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


fun getNumbers2(): Flow<Int> = flow {
    for (i  in 2..40 step 2) {
        delay(500)
        emit(i)
    }
}

suspend fun main() = coroutineScope {

    getNumbers2()
        .collect { num ->
            println("current number is: $num")
        }
}