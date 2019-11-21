package edu.svsu.projectlayout2.ui.deals

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import edu.svsu.projectlayout2.R

class DealsFragment : Fragment() {

    private lateinit var dealsViewModel: DealsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dealsViewModel =
            ViewModelProviders.of(this).get(DealsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_deals, container, false)
        val textView: TextView = root.findViewById(R.id.text_share)
        dealsViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}