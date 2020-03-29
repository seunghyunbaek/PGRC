package best.hyun.pgrc.type.woopu

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Woopu : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_woopu)
    override val type: PET_TYPE
        get() = PET_TYPE.WOOPU
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_woopu)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 60
    override val subElementalValue: Int
        get() = 40
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 32
    override val initLvMaxAtk: Int
        get() = 7
    override val initLvMaxDef: Int
        get() = 3
    override val initLvMaxSpd: Int
        get() = 6
    override val maxLvMaxHp: Int
        get() = 1324
    override val maxLvMaxAtk: Int
        get() = 314
    override val maxLvMaxDef: Int
        get() = 156
    override val maxLvMaxSpd: Int
        get() = 254
    override val initLvMinHp: Int
        get() = 24
    override val initLvMinAtk: Int
        get() = 6
    override val initLvMinDef: Int
        get() = 2
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1168
    override val maxLvMinAtk: Int
        get() = 276
    override val maxLvMinDef: Int
        get() = 118
    override val maxLvMinSpd: Int
        get() = 223
    override val minAllGrowth: Double
        get() = 4.389
    override val maxAllGrowth: Double
        get() = 5.096
}