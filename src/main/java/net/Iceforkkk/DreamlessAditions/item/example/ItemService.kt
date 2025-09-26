//package net.Iceforkkk.DreamlessAditions.item.example

//import net.Iceforkkk.DreamlessAditions.item.example.items.NewDSSArmorItem
//import kotlin.reflect.KClass

//class ItemService(
//    itemFactory: List<ItemFactory<*>>
//) {
//    private val itemFactoryMap = itemFactory.associateBy { it::class }



//    suspend fun <T: NewDSSArmorItem> createNewArmor(
//        type: KClass<T>,
//        metadata: Map<String, Any> = emptyMap()
//    ): T? {
//        return itemFactoryMap[type]?.createItem(metadata)
//    }
//}