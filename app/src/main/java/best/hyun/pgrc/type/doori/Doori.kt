package best.hyun.pgrc.type.doori

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Doori : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_doori)
    override val type: PET_TYPE
        get() = PET_TYPE.DOORI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_doori)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
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
        get() = 10
    override val initLvMaxDef: Int
        get() = 7
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLvMaxHp: Int
        get() = 1467
    override val maxLvMaxAtk: Int
        get() = 280
    override val maxLvMaxDef: Int
        get() = 210
    override val maxLvMaxSpd: Int
        get() = 232
    override val initLvMinHp: Int
        get() = 41
    override val initLvMinAtk: Int
        get() = 8
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1249
    override val maxLvMinAtk: Int
        get() = 241
    override val maxLvMinDef: Int
        get() = 170
    override val maxLvMinSpd: Int
        get() = 200
    override val minAllGrowth: Double
        get() = 4.288
    override val maxAllGrowth: Double
        get() = 5.023
}