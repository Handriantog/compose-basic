package com.undev.composebasic.model

data class Message(val author: String, val body: String)

object SampleData {

    val conversationSample = listOf<Message>(
        Message("Han", "Hello World!"),
        Message("Han", "So this is the sample conversation"),
        Message("Han", "I'm trying to learn how to create simple list"),
        Message("Han", "It's a lot easier than recycler view"),
        Message("Han", "But still, there's a lot to learn"),
        Message("Han", "Here's a really loongngngngngnngngngngnnngngngngngngnngng texxtttttttt to test out the animation of clicking the view alskdjflasjdflaksjdf  alskjdf la a sdjfkl jasdl;f jasdlfj ")
    )

}