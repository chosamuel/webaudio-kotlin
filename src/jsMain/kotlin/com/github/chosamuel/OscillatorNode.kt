package com.github.chosamuel

external class OscillatorNode: AudioScheduledSourceNode {
    constructor()
    constructor(context: AudioContext, options: dynamic)
    var frequency: AudioParam
    var detune: AudioParam
    var type: String
    var onended: ()->Unit

    fun setPeriodicWave()
}