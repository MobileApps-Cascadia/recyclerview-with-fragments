package com.example.plainolnotes4.data

import java.util.*

class SampleDataProvider {

    companion object{
        private val sampleText1 = "A simple note"
        private val sampleText2 = "A note a\nLine feed"
        private val sampleText3 = """ 
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas at nunc auctor, blandit mi quis, lobortis libero. Aenean placerat rutrum eros interdum sodales. Etiam dictum blandit lorem, in vehicula augue ultrices vitae. Curabitur tempor lacus id erat varius lacinia. Aenean tempor hendrerit ipsum at pellentesque. Proin porta varius metus eu fringilla. Vivamus maximus libero lobortis, rutrum urna ut, pretium mauris. Etiam porttitor, lorem ut ullamcorper blandit, arcu dolor laoreet augue, non varius metus dui at orci.

            In malesuada nec arcu quis sollicitudin. Donec eget rhoncus elit. Praesent ac mollis mauris. Integer iaculis, sapien quis sodales dignissim, felis ex tincidunt est, eget gravida magna orci sed massa. Vestibulum accumsan vel tortor id viverra. Nulla tincidunt leo velit, eget imperdiet metus iaculis ut. Etiam dictum et felis eleifend ullamcorper. Curabitur ac nulla ac enim porta vehicula. Sed purus ex, ornare sit amet tortor sed, bibendum aliquam odio. Curabitur vel tortor magna. Donec a mauris a dui ultrices accumsan. Quisque a elit a nulla congue malesuada.
        """.trimIndent()

        private fun getDate(diff: Long):Date{
            return Date(Date().time + diff)
        }

        fun getNote() = arrayListOf(
            NoteEntity(1, getDate(0), sampleText1),
            NoteEntity(2, getDate(1), sampleText2),
            NoteEntity(3, getDate(2), sampleText3),


        )


    }
}