package best.hyun.pgrc.type.gigaros

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Gagaros : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_gagaros)
    override val type: PET_TYPE
        get() = PET_TYPE.GIGAROS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_gagaros)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 62
    override val initLvMaxAtk: Int
        get() = 13
    override val initLvMaxDef: Int
        get() = 11
    override val initLvMaxSpd: Int
        get() = 4
    override val maxLvMaxHp: Int
        get() = 1583
    override val maxLvMaxAtk: Int
        get() = 331
    override val maxLvMaxDef: Int
        get() = 294
    override val maxLvMaxSpd: Int
        get() = 114
    override val initLvMinHp: Int
        get() = 49
    override val initLvMinAtk: Int
        get() = 10
    override val initLvMinDef: Int
        get() = 9
    override val initLvMinSpd: Int
        get() = 2
    override val maxLvMinHp: Int
        get() = 1373
    override val maxLvMinAtk: Int
        get() = 293
    override val maxLvMinDef: Int
        get() = 256
    override val maxLvMinSpd: Int
        get() = 82
    override val minAllGrowth: Double
        get() = 4.423
    override val maxAllGrowth: Double
        get() = 5.130
}