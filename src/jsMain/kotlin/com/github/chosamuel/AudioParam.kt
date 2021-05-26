package com.github.chosamuel

external class AudioParam() {
    val defaultValue: Double
    val maxValue: Double
    val minValue: Double
    var value: Double

    fun setValueAtTime(value: Double, time: Double)
    fun linearRampToValueAtTime(value: Double, endTime: Double)
    fun exponentialRampToValueAtTime(value: Double, endTime: Double)
    fun setTargetAtTime(target: Double,startTime: Double, endTime: Double)
    fun setValueCurveAtTime(value: Array<Double>, startTime: Double, duration: Double)
    fun cancelScheduledValues(startTime: Double)
    fun cancelAndHoldAtTime(cancelTime: Double)
}