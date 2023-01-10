package com.example.plainolnotes4.data

import java.util.Date

class SampleDataProvider {
    companion object{
        private val sampleText1 = "a simple note"
        private val sampleText2 = "a simple note\n line feed"
        private val sampleText3 = """
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. In hendrerit, libero varius sollicitudin viverra, tellus nisl semper diam, vitae luctus quam nisl nec odio. Morbi eu eleifend massa, a malesuada libero. Etiam quam metus, imperdiet vitae est eget, maximus dictum felis. Quisque varius ante et mauris varius, nec ultricies magna vestibulum. Aenean congue magna varius massa auctor, et placerat augue laoreet. Maecenas iaculis augue vel dolor rutrum, ac elementum risus dictum. Curabitur egestas ac arcu a blandit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce gravida hendrerit dolor, sed faucibus lacus dictum in. Vestibulum sollicitudin non ex eget pretium.

            Curabitur ut accumsan leo. Aenean felis ex, vehicula a suscipit eget, porta eu nisl. Aenean accumsan eget nulla ut finibus. Morbi pellentesque congue nisi, id varius lectus scelerisque vitae. Quisque congue magna lectus, eu imperdiet lacus tincidunt sed. Sed eget dolor commodo, blandit augue vel, cursus magna. Duis a sodales nisi. In eleifend facilisis felis ullamcorper pellentesque. Nullam sed libero eget ipsum pharetra tempus. In fermentum mauris nec neque dignissim malesuada. Phasellus suscipit fermentum ante, quis vulputate nisi ultrices sit amet. Nullam tempus nisl mauris, sit amet accumsan dolor sodales at. Praesent eu metus urna. Mauris vel congue velit, et posuere metus. Donec porta nulla orci.
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