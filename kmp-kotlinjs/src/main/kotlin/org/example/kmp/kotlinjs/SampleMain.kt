package org.example.kmp.kotlinjs

import org.example.kmp.common.RequestBack
import org.example.kmp.common.SampleDTO
import kotlin.browser.document

val requestBack = RequestBack()

fun main() {
    val obj = SampleDTO(
            stringProp = "example",
            intProp = 22,
            boolProp = false
    )
    val div = document.getElementById("sample-id")
    div?.innerHTML = obj.toString()
    document.getElementById("sample-button-id")?.addEventListener(
            "click",
            {
                console.log("requested")
                requestBack
                        .requestPromise("kotlinjs")
                        .then {

                            div?.innerHTML = it.toString()
                        }
            }
    )
}
