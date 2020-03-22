package best.hyun.pgrc.type.yangiro

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber


class Bino : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_bino)
    override val type: PET_TYPE
        get() = PET_TYPE.YANGIRO
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_bino)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = null
    override val mainElementalValue: Int
        get() = 100
    override val subElementalValue: Int
        get() = 0
    override val initLv: Int
        get() = 1
    override val initLvMaxHp: Int
        get() = 73
    override val initLvMaxAtk: Int
        get() = 17
    override val initLvMaxDef: Int
        get() = 11
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1535
    override val maxLvMaxAtk: Int
        get() = 364
    override val maxLvMaxDef: Int
        get() = 246
    override val maxLvMaxSpd: Int
        get() = 184
    override val initLvMinHp: Int
        get() = 58
    override val initLvMinAtk: Int
        get() = 14
    override val initLvMinDef: Int
        get() = 9
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1323
    override val maxLvMinAtk: Int
        get() = 325
    override val maxLvMinDef: Int
        get() = 207
    override val maxLvMinSpd: Int
        get() = 152
    override val minAllGrowth: Double
        get() = 4.750
    override val maxAllGrowth: Double
        get() = 5.457
}