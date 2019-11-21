package edu.svsu.projectlayout2.ui.sides

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import edu.svsu.projectlayout2.R

class SidesFragment : Fragment() {

    private lateinit var sidesViewModel: SidesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        sidesViewModel =
            ViewModelProviders.of(this).get(SidesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_sides, container, false)
        val textView: TextView = root.findViewById(R.id.text_tools)
        sidesViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}