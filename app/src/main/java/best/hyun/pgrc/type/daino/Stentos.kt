package best.hyun.pgrc.type.daino

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Stentos : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_stentos)
    override val type: PET_TYPE
        get() = PET_TYPE.DAINO
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_stentos)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 50
    override val subElementalValue: Int
        get() = 50
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 74
    override val initLvMaxAtk: Int
        get() = 11
    override val initLvMaxDef: Int
        get() = 13
    override val initLvMaxSpd: Int
        get() = 3
    override val maxLvMaxHp: Int
        get() = 1774
    override val maxLvMaxAtk: Int
        get() = 265
    override val maxLvMaxDef: Int
        get() = 327
    override val maxLvMaxSpd: Int
        get() = 66
    override val initLvMinHp: Int
        get() = 61
    override val initLvMinAtk: Int
        get() = 8
    override val initLvMinDef: Int
        get() = 11
    override val initLvMinSpd: Int
        get() = 1
    override val maxLvMinHp: Int
        get() = 1563
    override val maxLvMinAtk: Int
        get() = 226
    override val maxLvMinDef: Int
        get() = 288
    override val maxLvMinSpd: Int
        get() = 34
    override val minAllGrowth: Double
        get() = 3.838
    override val maxAllGrowth: Double
        get() = 4.545
}