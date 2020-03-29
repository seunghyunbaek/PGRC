package best.hyun.pgrc.type.bubi

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class KingBui : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_kingbui)
    override val type: PET_TYPE
        get() = PET_TYPE.BUBI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_kingbui)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
    override val subElemental: ELEMENTAL?
        get() = null
    override val mainElementalValue: Int
        get() = 100
    override val subElementalValue: Int
        get() = 0
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 80
    override val initLvMaxAtk: Int
        get() = 19
    override val initLvMaxDef: Int
        get() = 14
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLvMaxHp: Int
        get() = 1634
    override val maxLvMaxAtk: Int
        get() = 390
    override val maxLvMaxDef: Int
        get() = 284
    override val maxLvMaxSpd: Int
        get() = 170
    override val initLvMinHp: Int
        get() = 64
    override val initLvMinAtk: Int
        get() = 16
    override val initLvMinDef: Int
        get() = 11
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1422
    override val maxLvMinAtk: Int
        get() = 351
    override val maxLvMinDef: Int
        get() = 245
    override val maxLvMinSpd: Int
        get() = 139
    override val minAllGrowth: Double
        get() = 5.083
    override val maxAllGrowth: Double
        get() = 5.790
}