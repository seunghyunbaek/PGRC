package best.hyun.pgrc.type.rare

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Goruru : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_goruru)
    override val type: PET_TYPE
        get() = PET_TYPE.RARE
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_goruru)
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
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 71
    override val initLvMaxAtk: Int
        get() = 16
    override val initLvMaxDef: Int
        get() = 11
    override val initLvMaxSpd: Int
        get() = 10
    override val maxLvMaxHp: Int
        get() = 1586
    override val maxLvMaxAtk: Int
        get() = 379
    override val maxLvMaxDef: Int
        get() = 242
    override val maxLvMaxSpd: Int
        get() = 232
    override val initLvMinHp: Int
        get() = 57
    override val initLvMinAtk: Int
        get() = 14
    override val initLvMinDef: Int
        get() = 8
    override val initLvMinSpd: Int
        get() = 8
    override val maxLvMinHp: Int
        get() = 1374
    override val maxLvMinAtk: Int
        get() = 340
    override val maxLvMinDef: Int
        get() = 203
    override val maxLvMinSpd: Int
        get() = 200
    override val minAllGrowth: Double
        get() = 5.168
    override val maxAllGrowth: Double
        get() = 5.875
}