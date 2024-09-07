package br.com.faculdadeimpacta.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import br.com.faculdadeimpacta.myapplication.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {

    private var _binding: FragmentThirdBinding? = null
    private val binding get() = _binding!!
    private val args: ThirdFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentThirdBinding.inflate(inflater, container, false)

        val id = args.id
        val saldo = args.saldo
        binding.textView3.text = "${id} - ${saldo}"

        binding.button4.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_thirdFragment)
        }

        return binding.root
    }

}