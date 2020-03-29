package best.hyun.pgrc.type.tora

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Syuwoo : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_syuwoo)
    override val type: PET_TYPE
        get() = PET_TYPE.TORA
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_syuwoo)
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
        get() = 61
    override val initLvMaxAtk: Int
        get() = 15
    override val initLvMaxDef: Int
        get() = 8
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLvMaxHp: Int
        get() = 1457
    override val maxLvMaxAtk: Int
        get() = 358
    override val maxLvMaxDef: Int
        get() = 203
    override val maxLvMaxSpd: Int
        get() = 210
    override val initLvMinHp: Int
        get() = 48
    override val initLvMinAtk: Int
        get() = 12
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 7
    override val maxLvMinHp: Int
        get() = 1247
    override val maxLvMinAtk: Int
        get() = 319
    override val maxLvMinDef: Int
        get() = 165
    override val maxLvMinSpd: Int
        get() = 179
    override val minAllGrowth: Double
        get() = 4.627
    override val maxAllGrowth: Double
        get() = 5.334
}