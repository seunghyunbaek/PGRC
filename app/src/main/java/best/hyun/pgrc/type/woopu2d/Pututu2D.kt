package best.hyun.pgrc.type.woopu2d

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Pututu2D : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_pututu2d)
    override val type: PET_TYPE
        get() = PET_TYPE.WOOPU2D
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_pututu2d)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.EARTH
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 75
    override val initLvMaxAtk: Int
        get() = 16
    override val initLvMaxDef: Int
        get() = 10
    override val initLvMaxSpd: Int
        get() = 11
    override val maxLvMaxHp: Int
        get() = 1570
    override val maxLvMaxAtk: Int
        get() = 350
    override val maxLvMaxDef: Int
        get() = 213
    override val maxLvMaxSpd: Int
        get() = 239
    override val initLvMinHp: Int
        get() = 59
    override val initLvMinAtk: Int
        get() = 13
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 9
    override val maxLvMinHp: Int
        get() = 1358
    override val maxLvMinAtk: Int
        get() = 312
    override val maxLvMinDef: Int
        get() = 175
    override val maxLvMinSpd: Int
        get() = 208
    override val minAllGrowth: Double
        get() = 4.812
    override val maxAllGrowth: Double
        get() = 5.519
}