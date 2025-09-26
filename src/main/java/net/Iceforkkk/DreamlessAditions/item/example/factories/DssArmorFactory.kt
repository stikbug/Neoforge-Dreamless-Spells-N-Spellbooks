//package net.Iceforkkk.DreamlessAditions.item.example.factories
//
//import net.Iceforkkk.DreamlessAditions.item.example.ItemFactory
//import net.Iceforkkk.DreamlessAditions.item.example.items.armors.DSSArmorItem

//class DssArmorFactory: ItemFactory<DSSArmorItem> {

//    private val builders : Map<DssArmorType, Builder> = emptyMap()

//    override suspend fun createItem(
//        metadata: Map<String, Any>
//    ): DSSArmorItem {
//        val parameters = metadata.toDssArmorParameters()
//        return builders[parameters.type]
//            .build(parameters)
//    }

//    private fun Map<String, Any>.toDssArmorParameters() = DssArmorParameters(
//        spellPower = 1.0,
//        type = DssArmorType.EMPTY_HUNTER_ARMOR
//    )
//
//}


//data class DssArmorParameters(
//    val spellPower: Double,
//    val type: DssArmorType
//)

//enum class DssArmorType {
//    EMPTY_HUNTER_ARMOR,
//    EMPTY_BRAWLER_ARMOR,
//    EMPTY_PRIEST_ARMOR,
//    SOLAR_ARMOR,
//    VORTEX_ARMOR,
//    NEW_ARMOR
//}