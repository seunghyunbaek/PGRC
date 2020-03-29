package best.hyun.pgrc.type.negos

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Negos : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_negos)
    override val type: PET_TYPE
        get() = PET_TYPE.NEGOS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_negos)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.EARTH
    override val mainElementalValue: Int
        get() = 60
    override val subElementalValue: Int
        get() = 40
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 45
    override val initLvMaxAtk: Int
        get() = 10
    override val initLvMaxDef: Int
        get() = 8
    override val initLvMaxSpd: Int
        get() = 4
    override val maxLvMaxHp: Int
        get() = 1481
    override val maxLvMaxAtk: Int
        get() = 332
    override val maxLvMaxDef: Int
        get() = 265
    override val maxLvMaxSpd: Int
        get() = 154
    override val initLvMinHp: Int
        get() = 35
    override val initLvMinAtk: Int
        get() = 8
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 3
    override val maxLvMinHp: Int
        get() = 1273
    override val maxLvMinAtk: Int
        get() = 294
    override val maxLvMinDef: Int
        get() = 227
    override val maxLvMinSpd: Int
        get() = 122
    override val minAllGrowth: Double
        get() = 4.541
    override val maxAllGrowth: Double
        get() = 5.248
}