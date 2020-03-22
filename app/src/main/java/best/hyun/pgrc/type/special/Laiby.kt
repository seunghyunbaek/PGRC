package best.hyun.pgrc.type.special

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Laiby : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_laiby)
    override val type: PET_TYPE
        get() = PET_TYPE.SPECIAL
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_laiby)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 50
    override val subElementalValue: Int
        get() = 50
    override val initLv: Int
        get() = 1
    override val initLvMaxHp: Int
        get() = 73
    override val initLvMaxAtk: Int
        get() = 18
    override val initLvMaxDef: Int
        get() = 10
    override val initLvMaxSpd: Int
        get() = 13
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1528
    override val maxLvMaxAtk: Int
        get() = 390
    override val maxLvMaxDef: Int
        get() = 209
    override val maxLvMaxSpd: Int
        get() = 274
    override val initLvMinHp: Int
        get() = 57
    override val initLvMinAtk: Int
        get() = 15
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 10
    override val maxLvMinHp: Int
        get() = 1316
    override val maxLvMinAtk: Int
        get() = 351
    override val maxLvMinDef: Int
        get() = 171
    override val maxLvMinSpd: Int
        get() = 242
    override val minAllGrowth: Double
        get() = 5.297
    override val maxAllGrowth: Double
        get() = 6.004
}