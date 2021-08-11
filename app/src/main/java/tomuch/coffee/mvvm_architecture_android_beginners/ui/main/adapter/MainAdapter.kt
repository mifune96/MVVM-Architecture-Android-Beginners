package tomuch.coffee.mvvm_architecture_android_beginners.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_layout.view.*
import tomuch.coffee.mvvm_architecture_android_beginners.R
import tomuch.coffee.mvvm_architecture_android_beginners.data.model.User

class MainAdapter(
    private val users: ArrayList<User>
) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {


    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: User) {
            itemView.tv_username.text = user.name
            itemView.tv_useremail.text = user.email
            Glide.with(itemView.iv_avatar.context)
                .load(user.avatar)
                .into(itemView.iv_avatar)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = DataViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.item_layout, parent, false
        )
    )

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(users[position])

    fun addData(list: List<User>){
        users.addAll(list)
    }




}