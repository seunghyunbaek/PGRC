package best.hyun.pgrc.type.lagogo

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Hubaba : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_hubaba)
    override val type: PET_TYPE
        get() = PET_TYPE.LAGOGO
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_hubaba)
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
        get() = 53
    override val initLvMaxAtk: Int
        get() = 12
    override val initLvMaxDef: Int
        get() = 6
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLvMaxHp: Int
        get() = 1449
    override val maxLvMaxAtk: Int
        get() = 341
    override val maxLvMaxDef: Int
        get() = 181
    override val maxLvMaxSpd: Int
        get() = 216
    override val initLvMinHp: Int
        get() = 41
    override val initLvMinAtk: Int
        get() = 10
    override val initLvMinDef: Int
        get() = 4
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1239
    override val maxLvMinAtk: Int
        get() = 303
    override val maxLvMinDef: Int
        get() = 143
    override val maxLvMinSpd: Int
        get() = 185
    override val minAllGrowth: Double
        get() = 4.427
    override val maxAllGrowth: Double
        get() = 5.134
}