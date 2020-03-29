package best.hyun.pgrc.type.gordon

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Greengor : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_greengor)
    override val type: PET_TYPE
        get() = PET_TYPE.GORDON
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_greengor)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.EARTH
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 69
    override val initLvMaxAtk: Int
        get() = 16
    override val initLvMaxDef: Int
        get() = 11
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLvMaxHp: Int
        get() = 1544
    override val maxLvMaxAtk: Int
        get() = 370
    override val maxLvMaxDef: Int
        get() = 246
    override val maxLvMaxSpd: Int
        get() = 190
    override val initLvMinHp: Int
        get() = 55
    override val initLvMinAtk: Int
        get() = 14
    override val initLvMinDef: Int
        get() = 8
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1333
    override val maxLvMinAtk: Int
        get() = 332
    override val maxLvMinDef: Int
        get() = 208
    override val maxLvMinSpd: Int
        get() = 159
    override val minAllGrowth: Double
        get() = 4.855
    override val maxAllGrowth: Double
        get() = 5.562
}