package com.dev.ksw.termsexamplecode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.dev.ksw.termsexamplecode.adapter.TermsAdapter
import com.dev.ksw.termsexamplecode.databinding.ActivityTemrsBinding
import kotlinx.android.synthetic.main.activity_temrs.*

class TermsActivity : AppCompatActivity(){

    private val termsViewModel: TermsViewModel by lazy{ ViewModelProvider(this)[TermsViewModel::class.java]}

    private val termsAdapter by lazy { TermsAdapter(termsViewModel) }
    private lateinit var binding: ActivityTemrsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setToolbar()

        binding= DataBindingUtil.setContentView(this, R.layout.activity_temrs)
        binding.viewModel = termsViewModel
        binding.recyclerView.adapter = termsAdapter

        binding.lifecycleOwner = this
    }


    private fun setToolbar(){
        setSupportActionBar(toolbar)
    }
}