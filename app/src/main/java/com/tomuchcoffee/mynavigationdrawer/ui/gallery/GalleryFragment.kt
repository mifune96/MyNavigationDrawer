package com.tomuchcoffee.mynavigationdrawer.ui.gallery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.tomuchcoffee.mynavigationdrawer.R

class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel : GalleyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        galleryViewModel = ViewModelProvider(this).get(GalleyViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        galleryViewModel.text.observe(viewLifecycleOwner, {
            textView.text= it
        })
        return root
    }

}