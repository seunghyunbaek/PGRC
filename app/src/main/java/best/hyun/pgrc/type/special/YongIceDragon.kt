package best.hyun.pgrc.type.special

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber


class YongIceDragon: Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_youngicedragon)
    override val type: PET_TYPE
        get() = PET_TYPE.SPECIAL
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_youngicedragon)
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
    override val initLvMaxHp: Int
        get() = 82
    override val initLvMaxAtk: Int
        get() = 19
    override val initLvMaxDef: Int
        get() = 14
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1616
    override val maxLvMaxAtk: Int
        get() = 390
    override val maxLvMaxDef: Int
        get() = 290
    override val maxLvMaxSpd: Int
        get() = 171
    override val initLvMinHp: Int
        get() = 65
    override val initLvMinAtk: Int
        get() = 16
    override val initLvMinDef: Int
        get() = 11
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1403
    override val maxLvMinAtk: Int
        get() = 351
    override val maxLvMinDef: Int
        get() = 251
    override val maxLvMinSpd: Int
        get() = 139
    override val minAllGrowth: Double
        get() = 5.126
    override val maxAllGrowth: Double
        get() = 5.833
}