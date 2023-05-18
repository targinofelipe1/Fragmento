package com.example.fragmento1

import android.os.Build.VERSION_CODES.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_counter.view.*

class CounterFragment : Fragment() {

    private var counter: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_counter, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        updateCounter()

        view.btnIncrement.setOnClickListener {
            counter++
            updateCounter()
        }

        view.btnDecrement.setOnClickListener {
            counter--
            updateCounter()
        }
    }

    private fun updateCounter() {
        view?.txtCounter?.text = counter.toString()
    }
}