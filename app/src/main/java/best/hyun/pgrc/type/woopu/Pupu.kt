package best.hyun.pgrc.type.woopu

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Pupu : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_pupu)
    override val type: PET_TYPE
        get() = PET_TYPE.WOOPU
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_pupu)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
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
        get() = 26
    override val initLvMaxAtk: Int
        get() = 6
    override val initLvMaxDef: Int
        get() = 3
    override val initLvMaxSpd: Int
        get() = 5
    override val maxLvMaxHp: Int
        get() = 1305
    override val maxLvMaxAtk: Int
        get() = 307
    override val maxLvMaxDef: Int
        get() = 168
    override val maxLvMaxSpd: Int
        get() = 260
    override val initLvMinHp: Int
        get() = 20
    override val initLvMinAtk: Int
        get() = 5
    override val initLvMinDef: Int
        get() = 2
    override val initLvMinSpd: Int
        get() = 4
    override val maxLvMinHp: Int
        get() = 1098
    override val maxLvMinAtk: Int
        get() = 269
    override val maxLvMinDef: Int
        get() = 130
    override val maxLvMinSpd: Int
        get() = 229
    override val minAllGrowth: Double
        get() = 4.484
    override val maxAllGrowth: Double
        get() = 5.191
}