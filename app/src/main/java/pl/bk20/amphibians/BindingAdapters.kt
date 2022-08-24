package pl.bk20.amphibians

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import pl.bk20.amphibians.adapter.AmphibianListAdapter
import pl.bk20.amphibians.network.Amphibian

@BindingAdapter("listData")
fun listData(recyclerView: RecyclerView, list: List<Amphibian>?) {
    list?.let {
        val adapter = recyclerView.adapter as AmphibianListAdapter
        adapter.submitList(list)
    }
}