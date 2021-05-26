package com.github.chosamuel

import com.github.chosamuel.AudioDestinationNode
import com.github.chosamuel.GainNode
import com.github.chosamuel.OscillatorNode

external open class BaseAudioContext {
    val currentTime: Double
    val destination: AudioDestinationNode
    val sampleRate: Double

    fun createOscillator(): OscillatorNode
    fun createGain(): GainNode
}
