package com.example.plainolnotes4.data

import android.provider.ContactsContract.CommonDataKinds.Note
import java.util.Date

class SampleDataProvider {
    companion object {
        private val sampleText1 = "A simple note"
        private val sampleText2 = "A note a\nline feed"
        private val sampleText3 = """
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce id sagittis tellus, non ullamcorper eros. In eu leo non est pulvinar posuere dapibus vitae dui. Maecenas pulvinar sagittis neque, vel gravida ipsum. Quisque ullamcorper nec libero ac tristique. Aenean blandit purus augue, non condimentum magna iaculis vel. Curabitur aliquam arcu iaculis eros lobortis, ac consectetur elit interdum. Phasellus vestibulum felis id orci ultricies auctor non sit amet risus. Donec egestas urna et purus viverra iaculis.

            Proin ullamcorper ac nunc sed commodo. Ut a risus venenatis nulla efficitur tristique non hendrerit est. Nunc id libero dui. Morbi in turpis id libero tristique pulvinar bibendum a lectus. Fusce sed mi nec eros lacinia interdum id eu leo. Suspendisse aliquam fringilla quam vitae tristique. Pellentesque odio nisi, consequat vitae luctus vel, pellentesque vel ipsum. Sed sit amet luctus mi, ac laoreet nisl. Quisque in dapibus ex, eget consequat erat. Vivamus at libero justo. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
        """.trimIndent()

        private fun getDate(diff: Long): Date {
            return Date(Date().time + diff)
        }

        fun getNotes() = arrayListOf(
            NoteEntity(1, getDate(0), sampleText1),
            NoteEntity(2, getDate(1), sampleText2),
            NoteEntity(3, getDate(2), sampleText3)
        )

    }
}