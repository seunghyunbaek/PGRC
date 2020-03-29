package best.hyun.pgrc.type.woopu2d

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Notutu2D : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_notutu2d)
    override val type: PET_TYPE
        get() = PET_TYPE.WOOPU2D
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_notutu2d)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.EARTH
    override val mainElementalValue: Int
        get() = 90
    override val subElementalValue: Int
        get() = 10
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 66
    override val initLvMaxAtk: Int
        get() = 15
    override val initLvMaxDef: Int
        get() = 8
    override val initLvMaxSpd: Int
        get() = 12
    override val maxLvMaxHp: Int
        get() = 1455
    override val maxLvMaxAtk: Int
        get() = 353
    override val maxLvMaxDef: Int
        get() = 191
    override val maxLvMaxSpd: Int
        get() = 280
    override val initLvMinHp: Int
        get() = 51
    override val initLvMinAtk: Int
        get() = 13
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 10
    override val maxLvMinHp: Int
        get() = 1243
    override val maxLvMinAtk: Int
        get() = 314
    override val maxLvMinDef: Int
        get() = 153
    override val maxLvMinSpd: Int
        get() = 248
    override val minAllGrowth: Double
        get() = 4.974
    override val maxAllGrowth: Double
        get() = 5.681
}