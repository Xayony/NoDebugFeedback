# No Debug Feedback

Client-side Fabric mod for Minecraft 26.2. Suppresses the 
`[Debug]: ...` chat messages that F3 shortcuts print (F3+A, F3+T, F3+B,
F3+C, etc)

## How it works

All of those messages are sent through one vanilla method,
`KeyboardHandler.debugFeedbackTranslated(...)`. The mixin
(`KeyboardHandlerMixin`) injects at the head of that method and cancels
it, so nothing ever reaches chat. One mixin.

## Building

```
./gradlew build
```

Output jar lands in `build/libs/`. Drop it in your `mods` folder
