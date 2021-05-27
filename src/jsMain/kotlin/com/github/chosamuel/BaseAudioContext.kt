package com.github.chosamuel

import com.github.chosamuel.AudioDestinationNode
import com.github.chosamuel.GainNode
import com.github.chosamuel.OscillatorNode
import com.github.chosamuel.BiquadFilterNode

external open class BaseAudioContext {
    val currentTime: Double
    val destination: AudioDestinationNode
    val sampleRate: Double

    fun createOscillator(): OscillatorNode
    fun createBiquadFilter(): BiquadFilterNode
    fun createGain(): GainNode
}
