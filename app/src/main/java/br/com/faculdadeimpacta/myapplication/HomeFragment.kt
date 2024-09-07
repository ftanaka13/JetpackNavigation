package br.com.faculdadeimpacta.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import br.com.faculdadeimpacta.myapplication.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding.button.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_homeFragment_to_secondFragment)
        }

        binding.button3.setOnClickListener {
            val direction = HomeFragmentDirections.actionHomeFragmentToThirdFragment(100.25F, 1)
            findNavController().navigate(direction)
        }
    }

}