package pic_book.com.fibonaccisequence

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(var numList: List<Int>):
RecyclerView.Adapter<ViewHolderNumbers>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderNumbers {
        var  itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.number_list_item, parent,false)
        return ViewHolderNumbers(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderNumbers, position: Int) { //binds the data to the view
        holder.tvNum.text = numList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return numList.size
    }
}

class ViewHolderNumbers(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvNum = itemView.findViewById<TextView>(R.id.tvNum)
}
