package best.hyun.pgrc.type.woopu

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Tutu : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_tutu)
    override val type: PET_TYPE
        get() = PET_TYPE.WOOPU
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_tutu)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.EARTH
    override val mainElementalValue: Int
        get() = 70
    override val subElementalValue: Int
        get() = 30
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 36
    override val initLvMaxAtk: Int
        get() = 8
    override val initLvMaxDef: Int
        get() = 4
    override val initLvMaxSpd: Int
        get() = 5
    override val maxLvMaxHp: Int
        get() = 1407
    override val maxLvMaxAtk: Int
        get() = 310
    override val maxLvMaxDef: Int
        get() = 164
    override val maxLvMaxSpd: Int
        get() = 227
    override val initLvMinHp: Int
        get() = 28
    override val initLvMinAtk: Int
        get() = 6
    override val initLvMinDef: Int
        get() = 2
    override val initLvMinSpd: Int
        get() = 4
    override val maxLvMinHp: Int
        get() = 1199
    override val maxLvMinAtk: Int
        get() = 272
    override val maxLvMinDef: Int
        get() = 126
    override val maxLvMinSpd: Int
        get() = 196
    override val minAllGrowth: Double
        get() = 4.218
    override val maxAllGrowth: Double
        get() = 4.925
}