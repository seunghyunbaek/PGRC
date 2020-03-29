package best.hyun.pgrc.type.woopu2d

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Popo2D : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_popo2d)
    override val type: PET_TYPE
        get() = PET_TYPE.WOOPU2D
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_popo2d)
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
        get() = 67
    override val initLvMaxAtk: Int
        get() = 16
    override val initLvMaxDef: Int
        get() = 9
    override val initLvMaxSpd: Int
        get() = 11
    override val maxLvMaxHp: Int
        get() = 1496
    override val maxLvMaxAtk: Int
        get() = 367
    override val maxLvMaxDef: Int
        get() = 199
    override val maxLvMaxSpd: Int
        get() = 246
    override val initLvMinHp: Int
        get() = 53
    override val initLvMinAtk: Int
        get() = 13
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 9
    override val maxLvMinHp: Int
        get() = 1285
    override val maxLvMinAtk: Int
        get() = 328
    override val maxLvMinDef: Int
        get() = 161
    override val maxLvMinSpd: Int
        get() = 214
    override val minAllGrowth: Double
        get() = 4.888
    override val maxAllGrowth: Double
        get() = 5.595
}