package pl.bk20.amphibians

import android.view.View
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import pl.bk20.amphibians.adapter.AmphibianListAdapter
import pl.bk20.amphibians.data.AmphibianApiStatus
import pl.bk20.amphibians.network.Amphibian

@BindingAdapter("imageUrl")
fun imageUrl(imageView: ImageView, url: String?) {
    url?.let {
        val uri = it.toUri().buildUpon().scheme("https").build()
        imageView.load(uri) {
            error(R.drawable.ic_offline)
            placeholder(R.drawable.ic_loading)
        }
    }
}

@BindingAdapter("listData")
fun listData(recyclerView: RecyclerView, list: List<Amphibian>?) {
    list?.let {
        val adapter = recyclerView.adapter as AmphibianListAdapter
        adapter.submitList(list)
    }
}

@BindingAdapter("amphibianApiStatus")
fun amphibianApiStatus(imageView: ImageView, status: AmphibianApiStatus?) {
    status?.let {
        when (status) {
            AmphibianApiStatus.DONE -> {
                imageView.visibility = View.GONE
            }
            AmphibianApiStatus.ERROR -> {
                imageView.setImageResource(R.drawable.ic_offline)
                imageView.contentDescription = "Unable to load the amphibian list"
                imageView.visibility = View.VISIBLE
            }
            AmphibianApiStatus.LOADING -> {
                imageView.setImageResource(R.drawable.ic_loading)
                imageView.contentDescription = "Loading amphibians"
                imageView.visibility = View.VISIBLE
            }
        }
    }
}