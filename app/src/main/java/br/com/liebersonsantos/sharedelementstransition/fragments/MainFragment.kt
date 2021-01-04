package br.com.liebersonsantos.sharedelementstransition.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import br.com.liebersonsantos.sharedelementstransition.R
import br.com.liebersonsantos.sharedelementstransition.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private var _binding: FragmentMainBinding? = null
    private val binding: FragmentMainBinding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)

        binding.ivImage.setOnClickListener {
            val extras = FragmentNavigatorExtras(binding.ivImage to "image_big")
            findNavController().navigate(
                R.id.action_mainFragment_to_imageFragment,
                null,
                null,
                extras
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}