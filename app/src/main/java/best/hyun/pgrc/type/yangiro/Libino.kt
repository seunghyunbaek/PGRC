package best.hyun.pgrc.type.yangiro

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Libino: Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_libino)
    override val type: PET_TYPE
        get() = PET_TYPE.YANGIRO
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_libino)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = null
    override val mainElementalValue: Int
        get() = 100
    override val subElementalValue: Int
        get() = 0
    override val initLv: Int
        get() = 1
    override val initLvMaxHp: Int
        get() = 49
    override val initLvMaxAtk: Int
        get() = 10
    override val initLvMaxDef: Int
        get() = 7
    override val initLvMaxSpd: Int
        get() = 5
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1458
    override val maxLvMaxAtk: Int
        get() = 328
    override val maxLvMaxDef: Int
        get() = 218
    override val maxLvMaxSpd: Int
        get() = 147
    override val minAllGrowth: Double
        get() = 4.133
    override val maxAllGrowth: Double
        get() = 4.840
    override val initLvMinHp: Int
        get() = 38
    override val initLvMinAtk: Int
        get() = 9
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 3
    override val maxLvMinHp: Int
        get() = 1249
    override val maxLvMinAtk: Int
        get() = 290
    override val maxLvMinDef: Int
        get() = 180
    override val maxLvMinSpd: Int
        get() = 116
}