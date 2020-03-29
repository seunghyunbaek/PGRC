package best.hyun.pgrc.type.beron

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Beron : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_beron)
    override val type: PET_TYPE
        get() = PET_TYPE.BERON
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_beron)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 100
    override val subElementalValue: Int
        get() = 0
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 54
    override val initLvMaxAtk: Int
        get() = 12
    override val initLvMaxDef: Int
        get() = 8
    override val initLvMaxSpd: Int
        get() = 5
    override val maxLvMaxHp: Int
        get() = 1490
    override val maxLvMaxAtk: Int
        get() = 331
    override val maxLvMaxDef: Int
        get() = 232
    override val maxLvMaxSpd: Int
        get() = 134
    override val initLvMinHp: Int
        get() = 42
    override val initLvMinAtk: Int
        get() = 9
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 3
    override val maxLvMinHp: Int
        get() = 1280
    override val maxLvMinAtk: Int
        get() = 293
    override val maxLvMinDef: Int
        get() = 194
    override val maxLvMinSpd: Int
        get() = 103
    override val minAllGrowth: Double
        get() = 4.142
    override val maxAllGrowth: Double
        get() = 4.849
}