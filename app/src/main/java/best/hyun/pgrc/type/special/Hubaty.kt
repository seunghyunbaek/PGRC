package best.hyun.pgrc.type.special

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber


class Hubaty : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_hubaty)
    override val type: PET_TYPE
        get() = PET_TYPE.SPECIAL
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_hubaty)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
    override val subElemental: ELEMENTAL?
        get() = null
    override val mainElementalValue: Int
        get() = 100
    override val subElementalValue: Int
        get() = 0
    override val initLv: Int
        get() = 1
    override val initLvMaxHp: Int
        get() = 42
    override val initLvMaxAtk: Int
        get() = 7
    override val initLvMaxDef: Int
        get() = 10
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1386
    override val maxLvMaxAtk: Int
        get() = 257
    override val maxLvMaxDef: Int
        get() = 331
    override val maxLvMaxSpd: Int
        get() = 228
    override val initLvMinHp: Int
        get() = 32
    override val initLvMinAtk: Int
        get() = 6
    override val initLvMinDef: Int
        get() = 8
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1178
    override val maxLvMinAtk: Int
        get() = 219
    override val maxLvMinDef: Int
        get() = 293
    override val maxLvMinSpd: Int
        get() = 197
    override val minAllGrowth: Double
        get() = 5.007
    override val maxAllGrowth: Double
        get() = 5.714
}