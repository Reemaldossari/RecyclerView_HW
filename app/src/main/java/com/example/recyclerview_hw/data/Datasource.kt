package com.example.recyclerview_hw.data

import com.example.recyclerview_hw.R
import com.example.recyclerview_hw.model.show

class Datasource {
    fun month(): List<show>{
        return listOf<show>(
            show(R.string.month1),
            show(R.string.month2),
            show(R.string.month3),
            show(R.string.month4),
            show(R.string.month5),
            show(R.string.month6),
            show(R.string.month7),
            show(R.string.month8),
            show(R.string.month9),
            show(R.string.month10),
            show(R.string.month11),
            show(R.string.month12),

        )
    }
}
