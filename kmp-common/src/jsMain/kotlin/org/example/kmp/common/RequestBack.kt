package org.example.kmp.common

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.promise
import kotlin.js.Promise
import kotlin.random.Random

actual class RequestBack {
    private val random = Random(3945873498L)
    actual suspend fun request(query: String): SampleDTO {
        delay(1000L)
        return SampleDTO(
                stringProp = "js code",
                intProp = random.nextInt(99) + 100,
                boolProp = true
        )
    }

    @JsName("requestPromise")
    fun requestPromise(query: String): Promise<SampleDTO> = GlobalScope.promise {
        request(query)
    }
}
