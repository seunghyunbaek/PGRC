package best.hyun.pgrc.type.storaji

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Tarnoros : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_tarnoros)
    override val type: PET_TYPE
        get() = PET_TYPE.STORAJI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_tarnoros)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
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
        get() = 55
    override val initLvMaxAtk: Int
        get() = 11
    override val initLvMaxDef: Int
        get() = 7
    override val initLvMaxSpd: Int
        get() = 6
    override val maxLvMaxHp: Int
        get() = 1577
    override val maxLvMaxAtk: Int
        get() = 326
    override val maxLvMaxDef: Int
        get() = 222
    override val maxLvMaxSpd: Int
        get() = 188
    override val initLvMinHp: Int
        get() = 43
    override val initLvMinAtk: Int
        get() = 9
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1367
    override val maxLvMinAtk: Int
        get() = 288
    override val maxLvMinDef: Int
        get() = 184
    override val maxLvMinSpd: Int
        get() = 157
    override val minAllGrowth: Double
        get() = 4.423
    override val maxAllGrowth: Double
        get() = 5.130
}