package best.hyun.pgrc.type.rare

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Kingkkomi : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_kingkkomi)
    override val type: PET_TYPE
        get() = PET_TYPE.RARE
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_kingkkomi)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 90
    override val subElementalValue: Int
        get() = 10
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 78
    override val initLvMaxAtk: Int
        get() = 20
    override val initLvMaxDef: Int
        get() = 10
    override val initLvMaxSpd: Int
        get() = 13
    override val maxLvMaxHp: Int
        get() = 1532
    override val maxLvMaxAtk: Int
        get() = 398
    override val maxLvMaxDef: Int
        get() = 210
    override val maxLvMaxSpd: Int
        get() = 268
    override val initLvMinHp: Int
        get() = 61
    override val initLvMinAtk: Int
        get() = 17
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 11
    override val maxLvMinHp: Int
        get() = 1320
    override val maxLvMinAtk: Int
        get() = 359
    override val maxLvMinDef: Int
        get() = 172
    override val maxLvMinSpd: Int
        get() = 236
    override val minAllGrowth: Double
        get() = 5.297
    override val maxAllGrowth: Double
        get() = 6.004
}