package best.hyun.pgrc.type.lagogo

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Toruru : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_toruru)
    override val type: PET_TYPE
        get() = PET_TYPE.LAGOGO
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_toruru)
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
        get() = 44
    override val initLvMaxAtk: Int
        get() = 9
    override val initLvMaxDef: Int
        get() = 6
    override val initLvMaxSpd: Int
        get() = 5
    override val maxLvMaxHp: Int
        get() = 1513
    override val maxLvMaxAtk: Int
        get() = 342
    override val maxLvMaxDef: Int
        get() = 214
    override val maxLvMaxSpd: Int
        get() = 174
    override val initLvMinHp: Int
        get() = 34
    override val initLvMinAtk: Int
        get() = 8
    override val initLvMinDef: Int
        get() = 4
    override val initLvMinSpd: Int
        get() = 3
    override val maxLvMinHp: Int
        get() = 1305
    override val maxLvMinAtk: Int
        get() = 304
    override val maxLvMinDef: Int
        get() = 176
    override val maxLvMinSpd: Int
        get() = 143
    override val minAllGrowth: Double
        get() = 4.404
    override val maxAllGrowth: Double
        get() = 5.111
}