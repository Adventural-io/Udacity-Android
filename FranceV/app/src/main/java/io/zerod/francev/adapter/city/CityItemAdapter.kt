package io.zerod.francev.adapter.city

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.zerod.francev.R
import io.zerod.francev.model.City

class CityItemAdapter(val context: Context, val dataset: List<City>) :
    RecyclerView.Adapter<CityItemAdapter.CityItemViewHolder>() {
    class CityItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val cityNameTextView: TextView = view.findViewById(R.id.city_name_text)
        val cityDescriptionTextView: TextView = view.findViewById(R.id.city_description_text)
        val cityImageView: ImageView = view.findViewById(R.id.city_bg_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.city_item_adapter, parent, false)

        return CityItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: CityItemViewHolder, position: Int) {
        val cityItem = dataset[position]
        holder.cityNameTextView.text = context.resources.getString(cityItem.cityNameStringId)
        holder.cityDescriptionTextView.text = context.resources.getString(cityItem.cityDescriptionStringId)
        holder.cityImageView.setImageResource(cityItem.cityImageResource)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}