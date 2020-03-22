package best.hyun.pgrc.type.beast

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class MecaWaterHorse : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_mecawaterhorse)
    override val type: PET_TYPE
        get() = PET_TYPE.BEAST
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_mecawaterhorse)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.FIRE
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val initLvMaxHp: Int
        get() = 92
    override val initLvMaxAtk: Int
        get() = 20
    override val initLvMaxDef: Int
        get() = 15
    override val initLvMaxSpd: Int
        get() = 10
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1585
    override val maxLvMaxAtk: Int
        get() = 363
    override val maxLvMaxDef: Int
        get() = 262
    override val maxLvMaxSpd: Int
        get() = 186
    override val initLvMinHp: Int
        get() = 72
    override val initLvMinAtk: Int
        get() = 17
    override val initLvMinDef: Int
        get() = 11
    override val initLvMinSpd: Int
        get() = 8
    override val maxLvMinHp: Int
        get() = 1372
    override val maxLvMinAtk: Int
        get() = 324
    override val maxLvMinDef: Int
        get() = 223
    override val maxLvMinSpd: Int
        get() = 154
    override val minAllGrowth: Double
        get() = 4.812
    override val maxAllGrowth: Double
        get() = 5.519
}