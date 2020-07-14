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
    // Compilation success: extension is resolved to the getter method in Java
    consumePlugin(Action { plugin ->
        plugin.extension
    })

    // Compilation error: Cannot access 'extension': it is private in 'BasePlugin2'
    consumePlugin2(Action { plugin ->
        plugin.extension
    })
}