package com.github.chosamuel

import org.w3c.dom.events.EventTarget


external open class AudioNode : EventTarget {
    fun connect(target: AudioNode)
    fun disconnect()
}
