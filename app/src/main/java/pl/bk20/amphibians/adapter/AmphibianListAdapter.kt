package pl.bk20.amphibians.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import pl.bk20.amphibians.databinding.AmphibianListItemBinding
import pl.bk20.amphibians.network.Amphibian

class AmphibianListAdapter :
    ListAdapter<Amphibian, AmphibianListAdapter.AmphibianViewHolder>(DiffCallback) {

    companion object DiffCallback : DiffUtil.ItemCallback<Amphibian>() {
        override fun areItemsTheSame(oldItem: Amphibian, newItem: Amphibian): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Amphibian, newItem: Amphibian): Boolean {
            return oldItem.name == newItem.name && oldItem.type == newItem.type
        }
    }

    class AmphibianViewHolder(private val binding: AmphibianListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(amphibian: Amphibian) {
            binding.amphibian = amphibian
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AmphibianViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = AmphibianListItemBinding.inflate(layoutInflater)
        return AmphibianViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AmphibianViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }
}