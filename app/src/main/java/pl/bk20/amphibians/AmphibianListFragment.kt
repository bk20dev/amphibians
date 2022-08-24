package pl.bk20.amphibians

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import pl.bk20.amphibians.adapter.AmphibianListAdapter
import pl.bk20.amphibians.data.AmphibianViewModel
import pl.bk20.amphibians.databinding.FragmentAmphibianListBinding

class AmphibianListFragment : Fragment() {
    private val viewModel: AmphibianViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentAmphibianListBinding.inflate(inflater)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        binding.amphibiansList.adapter = AmphibianListAdapter()
        return binding.root
    }
}