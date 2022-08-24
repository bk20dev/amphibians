package pl.bk20.amphibians

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import pl.bk20.amphibians.databinding.FragmentAmphibianListBinding

class AmphibianListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentAmphibianListBinding.inflate(inflater)
        return binding.root
    }
}