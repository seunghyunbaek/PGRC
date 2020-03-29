package best.hyun.pgrc.type.bubi

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber


class Bubi : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_bubi)
    override val type: PET_TYPE
        get() = PET_TYPE.BUBI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_bubi)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 38
    override val initLvMaxAtk: Int
        get() = 5
    override val initLvMaxDef: Int
        get() = 4
    override val initLvMaxSpd: Int
        get() = 2
    override val maxLvMaxHp: Int
        get() = 1817
    override val maxLvMaxAtk: Int
        get() = 235
    override val maxLvMaxDef: Int
        get() = 208
    override val maxLvMaxSpd: Int
        get() = 121
    override val initLvMinHp: Int
        get() = 31
    override val initLvMinAtk: Int
        get() = 3
    override val initLvMinDef: Int
        get() = 3
    override val initLvMinSpd: Int
        get() = 1
    override val maxLvMinHp: Int
        get() = 1595
    override val maxLvMinAtk: Int
        get() = 194
    override val maxLvMinDef: Int
        get() = 168
    override val maxLvMinSpd: Int
        get() = 88
    override val minAllGrowth: Double
        get() = 3.221
    override val maxAllGrowth: Double
        get() = 3.984
}