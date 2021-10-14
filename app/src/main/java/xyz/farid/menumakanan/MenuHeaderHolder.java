package xyz.farid.menumakanan;

class MenuHeaderHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val itemHeader = itemView.findViewById(R.id.tvHeaderItem) as TextView
        fun bindContent(text: String){
        itemHeader.text = text
    }
}
