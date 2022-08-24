package pl.bk20.amphibians

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import pl.bk20.amphibians.databinding.FragmentAmphibianDetailsBinding

class AmphibianDetailsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentAmphibianDetailsBinding.inflate(inflater)
        binding.lifecycleOwner = this
        return binding.root
    }
}