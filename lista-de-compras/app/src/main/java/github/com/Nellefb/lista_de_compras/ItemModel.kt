package github.com.Nellefb.lista_de_compras

data class ItemModel(
        val id: Int,
    val name: String,
        val onRemove: (ItemModel) -> Unit
)