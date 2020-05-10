package com.dev.ksw.termsexamplecode.data

import androidx.databinding.ObservableBoolean

data class TermsData(
    var termsSequence: Int,
    var termsTitle: String,
    var required: Boolean,
    var content: String,
    val checked: ObservableBoolean = ObservableBoolean(false)
)