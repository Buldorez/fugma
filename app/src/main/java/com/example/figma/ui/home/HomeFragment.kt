package com.example.figma.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.figma.R
import com.example.figma.databinding.FragmentHomeBinding
import com.example.figma.recadapters.FeelRecycler
import com.example.figma.recadapters.MyFeel
import com.example.figma.recadapters.StateRecycler
import com.example.figma.recadapters.MyState

class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false)

        val feel_recycler : RecyclerView = root.findViewById(R.id.feel_rec)
feel_recycler.adapter = FeelRecycler(requireContext(),MyFeel().list)

        val state_recycler: RecyclerView = root.findViewById(R.id.state_Rec)
        state_recycler.adapter = StateRecycler(requireContext(),MyState().state_list)
        return root
    }

}