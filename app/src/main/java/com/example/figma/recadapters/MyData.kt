package com.example.figma.recadapters

import com.example.figma.R

data class feel(val image:Int, val name_feel:String)
class MyFeel {
    val list = arrayListOf(feel(R.drawable.spir, "Безмятежным"),
        feel(R.drawable.relax, "Расслабленным"),
        feel(R.drawable.focus, "Сосредоточенным"),
        feel(R.drawable.anxious, "Взволнованным"),
        feel(R.drawable.vopros, "Задумчивым"),
        feel(R.drawable.anarch, "Независимым"),
        feel(R.drawable.plac, "Плаксивым")

    )
}
data class state(val state_title:String,val state_text:String,val state_image: Int)
class MyState
{val state_list = arrayListOf(state("Заголовок статьи","Краткое описание",R.drawable.heart),
    state("Заголовок статьи 1","Краткое описание 1", R.drawable.medi),
    state("Заголовок статьи 2","Краткое описание 2", R.drawable.kozer)

)

}


