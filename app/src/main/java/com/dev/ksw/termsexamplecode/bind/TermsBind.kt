package com.dev.ksw.termsexamplecode.bind

import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.dev.ksw.termsexamplecode.R
import com.dev.ksw.termsexamplecode.adapter.TermsAdapter
import com.dev.ksw.termsexamplecode.data.TermsData

@BindingAdapter("termsItems")
fun RecyclerView.bindTermsItem(list: List<TermsData>?) {
    list?.let {
        (adapter as TermsAdapter).submitList(list)
    }
}

@BindingAdapter(value = ["termsTitle","termsRequired"],requireAll = true)
fun TextView.setTermsString(termsStr: String, required: Boolean) {
    val termsText = if (required) {
        String.format(this.context.getString(R.string.terms_title_required_true),termsStr)
    } else {
        String.format(this.context.getString(R.string.terms_title_required_false),termsStr)
    }

    this.text = termsText
}