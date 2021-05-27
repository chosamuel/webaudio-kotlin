package com.github.chosamuel

import com.github.chosamuel.AudioContext
import com.github.chosamuel.AudioNode
import com.github.chosamuel.AudioParam

external class BiquadFilterNode: AudioNode {
    constructor()
    constructor(context: AudioContext, options: dynamic)
    val frequency: AudioParam
    val detune: AudioParam
    val Q: AudioParam
    val gain: AudioParam
    var type: String

    fun getFrequencyResponse()
}