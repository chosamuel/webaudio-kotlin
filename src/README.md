# WebAudio Kotlin

---

A library of KotlinJS externals for the WebAudio API. Currently
still a Work In Progress. 

## Using 
This library can be added as a local maven artifact. Clone,
publish to Maven local and import it with gradle into your
KotlinJS project. It then can be used directly. 

### Example
```kotlin
fun main() {
    /*
    The Audio Context can be created with a JS object. 
    This library includes a jsObject helper function
    to create JS objects.
     */
    val ctx = AudioContext(jsObject {
        latencyHint = "interactive"
        sampleRate = 44100
    })

    val osc = ctx.createOscillator()
    osc.type = "square"
    osc.frequency.setValueAtTime(440.0,ctx.currentTime)
    osc.start()

    val gain = ctx.createGain()
    gain.gain.setValueAtTime(0.0,ctx.currentTime)

    osc.connect(gain)
    gain.connect(ctx.destination)

    window.addEventListener("mousedown",{ e ->
        gain.gain.setValueAtTime(1.0,ctx.currentTime)
        console.log("mouse down")
    })
    window.addEventListener("mouseup",{ e ->
        gain.gain.setValueAtTime(0.0,ctx.currentTime)
        console.log("mouse up")
    })
}
```

## Contributing 
As this is just a library of externals, contributing is easy!
If you see something that isn't here but is in the 
[WebAudio API Docs](https://developer.mozilla.org/en-US/docs/Web/API/Web_Audio_API),
please do help out by filling in the external declarations.


## Notes
For some reason, KotlinJS doesn't come with bindings for
WebAudio. An [issue](https://youtrack.jetbrains.com/issue/KT-39846) 
has been brought up on Jetbrains's youtrack. But there 
has been no follow up.

