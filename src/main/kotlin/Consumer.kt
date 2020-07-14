package com.chaozhang.sample

abstract class Wrapped

abstract class Wrapping<Wrapped>

private fun consumePlugin(action: Action<BasePlugin>) {
    println(action.toString())
}

private fun consumePlugin2(action: Action<BasePlugin2<*, *>>) {
    println(action.toString())
}

fun main() {
    consumePlugin(Action { plugin ->
        plugin.extension
    })

    consumePlugin2(Action { plugin ->
        plugin.extension
    })
}