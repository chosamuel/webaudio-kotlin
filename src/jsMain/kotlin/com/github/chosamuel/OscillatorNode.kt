package com.github.chosamuel

external class OscillatorNode: AudioScheduledSourceNode {
    var frequency: AudioParam
    var detune: AudioParam
    var type: String
    var onended: ()->Unit

    fun setPeriodicWave()
}