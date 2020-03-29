package best.hyun.pgrc.type.tora

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Karpe : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_karpe)
    override val type: PET_TYPE
        get() = PET_TYPE.TORA
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_karpe)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 60
    override val subElementalValue: Int
        get() = 40
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 59
    override val initLvMaxAtk: Int
        get() = 14
    override val initLvMaxDef: Int
        get() = 7
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLvMaxHp: Int
        get() = 1448
    override val maxLvMaxAtk: Int
        get() = 363
    override val maxLvMaxDef: Int
        get() = 190
    override val maxLvMaxSpd: Int
        get() = 210
    override val initLvMinHp: Int
        get() = 46
    override val initLvMinAtk: Int
        get() = 12
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1238
    override val maxLvMinAtk: Int
        get() = 324
    override val maxLvMinDef: Int
        get() = 151
    override val maxLvMinSpd: Int
        get() = 179
    override val minAllGrowth: Double
        get() = 4.575
    override val maxAllGrowth: Double
        get() = 5.282
}