package io.zerod.francev.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import io.zerod.francev.R
import io.zerod.francev.adapter.city.CityItemAdapter
import io.zerod.francev.data.DataSource
import io.zerod.francev.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        //val root = inflater.inflate(R.layout.fragment_home, container, false)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        /*
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
                return root
         */
        //(activity as AppCompatActivity?)!!.supportActionBar!!.hide()

        val myCities = DataSource().loadCities()
        binding.cityRecycleView.apply {
            adapter = CityItemAdapter(activity?.applicationContext!!, myCities)
            setHasFixedSize(true)
        }
        return binding.root
    }
}