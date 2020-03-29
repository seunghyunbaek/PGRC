package best.hyun.pgrc.type.dog

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Jimung : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_jimung)
    override val type: PET_TYPE
        get() = PET_TYPE.DOG
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_jimung)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 90
    override val subElementalValue: Int
        get() = 10
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 82
    override val initLvMaxAtk: Int
        get() = 19
    override val initLvMaxDef: Int
        get() = 15
    override val initLvMaxSpd: Int
        get() = 10
    override val maxLvMaxHp: Int
        get() = 1523
    override val maxLvMaxAtk: Int
        get() = 368
    override val maxLvMaxDef: Int
        get() = 281
    override val maxLvMaxSpd: Int
        get() = 185
    override val initLvMinHp: Int
        get() = 64
    override val initLvMinAtk: Int
        get() = 16
    override val initLvMinDef: Int
        get() = 12
    override val initLvMinSpd: Int
        get() = 7
    override val maxLvMinHp: Int
        get() = 1310
    override val maxLvMinAtk: Int
        get() = 329
    override val maxLvMinDef: Int
        get() = 242
    override val maxLvMinSpd: Int
        get() = 153
    override val minAllGrowth: Double
        get() = 4.993
    override val maxAllGrowth: Double
        get() = 5.700
}