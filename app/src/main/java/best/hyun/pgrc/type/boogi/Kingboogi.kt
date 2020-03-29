package best.hyun.pgrc.type.boogi

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Kingboogi : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_kingboogi)
    override val type: PET_TYPE
        get() = PET_TYPE.BOOGI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_kingboogi)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 90
    override val subElementalValue: Int
        get() = 10
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 46
    override val initLvMaxAtk: Int
        get() = 8
    override val initLvMaxDef: Int
        get() = 11
    override val initLvMaxSpd: Int
        get() = 2
    override val maxLvMaxHp: Int
        get() = 1508
    override val maxLvMaxAtk: Int
        get() = 293
    override val maxLvMaxDef: Int
        get() = 373
    override val maxLvMaxSpd: Int
        get() = 86
    override val initLvMinHp: Int
        get() = 36
    override val initLvMinAtk: Int
        get() = 7
    override val initLvMinDef: Int
        get() = 9
    override val initLvMinSpd: Int
        get() = 1
    override val maxLvMinHp: Int
        get() = 1300
    override val maxLvMinAtk: Int
        get() = 255
    override val maxLvMinDef: Int
        get() = 335
    override val maxLvMinSpd: Int
        get() = 54
    override val minAllGrowth: Double
        get() = 4.551
    override val maxAllGrowth: Double
        get() = 5.258
}