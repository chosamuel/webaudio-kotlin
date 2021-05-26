package com.github.chosamuel


external class AudioContext: BaseAudioContext {
    constructor()
    constructor(audioContextOptions: dynamic)

    fun resume()
    fun suspend()
    fun close()
}