package best.hyun.pgrc.type.boogi

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Cheolboogi : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_cheolboogi)
    override val type: PET_TYPE
        get() = PET_TYPE.BOOGI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_cheolboogi)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 44
    override val initLvMaxAtk: Int
        get() = 9
    override val initLvMaxDef: Int
        get() = 10
    override val initLvMaxSpd: Int
        get() = 3
    override val maxLvMaxHp: Int
        get() = 1440
    override val maxLvMaxAtk: Int
        get() = 316
    override val maxLvMaxDef: Int
        get() = 334
    override val maxLvMaxSpd: Int
        get() = 113
    override val initLvMinHp: Int
        get() = 34
    override val initLvMinAtk: Int
        get() = 7
    override val initLvMinDef: Int
        get() = 8
    override val initLvMinSpd: Int
        get() = 2
    override val maxLvMinHp: Int
        get() = 1232
    override val maxLvMinAtk: Int
        get() = 278
    override val maxLvMinDef: Int
        get() = 296
    override val maxLvMinSpd: Int
        get() = 82
    override val minAllGrowth: Double
        get() = 4.627
    override val maxAllGrowth: Double
        get() = 5.334
}