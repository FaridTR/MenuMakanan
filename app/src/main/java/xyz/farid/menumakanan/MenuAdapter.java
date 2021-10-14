package xyz.farid.menumakanan;

class MenuAdapter{};private {val data: List<Any>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

        companion object {
private const val ITEM_HEADER = 0
private const val ITEM_MENU = 1
        }

        override fun getItemViewType(position: Int): Int {
        return when (data[position]) {
        is String -> ITEM_HEADER
        is MenuItem -> ITEM_MENU
        else -> throw IllegalArgumentException("Undefined view type")
        }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
        ITEM_HEADER -> MenuHeaderHolder(parent.inflate(R.layout.item_header))
        ITEM_MENU -> MenuItemHolder(parent.inflate(R.layout.item_menu))
        else -> throw throw IllegalArgumentException("Undefined view type")
        }
        }


        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
        ITEM_HEADER -> {
        val headerHolder = holder as MenuHeaderHolder
        headerHolder.bindContent(data[position] as String)
        }
        ITEM_MENU -> {
        val itemHolder = holder as MenuItemHolder
        itemHolder.bindContent(data[position] as MenuItem)
        }
        else -> throw IllegalArgumentException("Undefined view type")
        }
        }

        override fun getItemCount() = data.size
        }