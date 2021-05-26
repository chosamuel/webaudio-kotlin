package com.github.chosamuel

import org.w3c.dom.events.EventTarget

external open class AudioNode : EventTarget {
    val context: BaseAudioContext
    val numberOfInputs: Int
    val numberOfOutputs: Int
    var channelCount: Int
    var channelCountMode: String
    var channelInterpretation: String

    /**
     * @param T can be AudioNode or AudioParam
     */
    fun <T> connect(target: T)
    fun disconnect()
}
