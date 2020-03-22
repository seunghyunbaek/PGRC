package best.hyun.pgrc.type.beast

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class FireMouse : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_firemouse)
    override val type: PET_TYPE
        get() = PET_TYPE.BEAST
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_firemouse)
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
    override val initLvMaxHp: Int
        get() = 67
    override val initLvMaxAtk: Int
        get() = 17
    override val initLvMaxDef: Int
        get() = 9
    override val initLvMaxSpd: Int
        get() = 10
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1549
    override val maxLvMaxAtk: Int
        get() = 403
    override val maxLvMaxDef: Int
        get() = 223
    override val maxLvMaxSpd: Int
        get() = 245
    override val initLvMinHp: Int
        get() = 53
    override val initLvMinAtk: Int
        get() = 14
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 8
    override val maxLvMinHp: Int
        get() = 1338
    override val maxLvMinAtk: Int
        get() = 364
    override val maxLvMinDef: Int
        get() = 184
    override val maxLvMinSpd: Int
        get() = 214
    override val minAllGrowth: Double
        get() = 5.306
    override val maxAllGrowth: Double
        get() = 6.013
}