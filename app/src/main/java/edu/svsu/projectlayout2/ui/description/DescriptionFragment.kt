package edu.svsu.projectlayout2.ui.description

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import edu.svsu.projectlayout2.R

class DescriptionFragment : Fragment() {

    private lateinit var descriptionViewModel: DescriptionViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        descriptionViewModel =
            ViewModelProviders.of(this).get(DescriptionViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_description, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        descriptionViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}