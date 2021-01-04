package br.com.liebersonsantos.sharedelementstransition.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import br.com.liebersonsantos.sharedelementstransition.R

class ImageFragment : Fragment(R.layout.fragment_image) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val animation = android.transition.TransitionInflater.from(requireContext()).inflateTransition(
                android.R.transition.move
            )

        sharedElementEnterTransition = animation
        sharedElementReturnTransition = animation
    }
}