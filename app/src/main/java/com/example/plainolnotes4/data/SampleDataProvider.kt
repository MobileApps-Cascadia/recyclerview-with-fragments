package com.example.plainolnotes4.data
import java.util.*
class SampleDataProvider {
    companion object{
        private val sampleText1 = "A simple note"
        private val sampleText2 = "A note a\nLine feed"
        private val sampleText3 = """
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris dignissim ullamcorper varius. Nulla tincidunt lacus vel sapien convallis sagittis. Aliquam erat volutpat. Cras vitae nunc sed justo egestas dignissim. Vivamus ut mollis nibh, id posuere lorem. Proin ullamcorper elit ipsum, id interdum tellus mollis sit amet. Ut vel ullamcorper leo, sed laoreet sem. Mauris pulvinar libero eu tortor dignissim aliquam. Donec id libero ut ante ullamcorper convallis sed a turpis. Donec in libero efficitur, volutpat turpis eget, egestas est. Donec maximus tincidunt leo sed dignissim. Aenean velit justo, lacinia at pretium eu, porta sed dui. Nunc imperdiet tellus et arcu aliquam, eu fermentum neque tempor. Suspendisse pretium nec ligula a aliquam. Fusce eleifend suscipit mauris sed scelerisque.

            Donec placerat leo et lacinia facilisis. Interdum et malesuada fames ac ante ipsum primis in faucibus. Maecenas aliquam venenatis tortor, ut tincidunt augue iaculis id. Ut accumsan ornare justo, ut malesuada est iaculis a. Morbi non lectus elit. Proin pulvinar bibendum fringilla. Nulla non elit elit. Nulla iaculis a lorem vel ornare. In congue mi quis dui aliquet, vel tempor erat cursus. Donec vel lacus eget velit egestas volutpat interdum eget turpis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Proin in laoreet odio. Duis fermentum imperdiet augue, tristique ultricies felis. Proin sed molestie ante. Sed accumsan at ex et iaculis.
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