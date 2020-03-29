package best.hyun.pgrc.type.special

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber


class Kawoo: Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_kawoo)
    override val type: PET_TYPE
        get() = PET_TYPE.SPECIAL
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_kawoo)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val initLvMaxHp: Int
        get() = 81
    override val initLvMaxAtk: Int
        get() = 19
    override val initLvMaxDef: Int
        get() = 15
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1602
    override val maxLvMaxAtk: Int
        get() = 391
    override val maxLvMaxDef: Int
        get() = 303
    override val maxLvMaxSpd: Int
        get() = 171
    override val initLvMinHp: Int
        get() = 64
    override val initLvMinAtk: Int
        get() = 16
    override val initLvMinDef: Int
        get() = 12
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1389
    override val maxLvMinAtk: Int
        get() = 352
    override val maxLvMinDef: Int
        get() = 265
    override val maxLvMinSpd: Int
        get() = 139
    override val minAllGrowth: Double
        get() = 5.221
    override val maxAllGrowth: Double
        get() = 5.928
}