package best.hyun.pgrc.type.kukuru

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Kukuru : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_kukuru)
    override val type: PET_TYPE
        get() = PET_TYPE.KUKURU
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_kukuru)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.FIRE
    override val mainElementalValue: Int
        get() = 70
    override val subElementalValue: Int
        get() = 30
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 55
    override val initLvMaxAtk: Int
        get() = 12
    override val initLvMaxDef: Int
        get() = 7
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLvMaxHp: Int
        get() = 1458
    override val maxLvMaxAtk: Int
        get() = 330
    override val maxLvMaxDef: Int
        get() = 194
    override val maxLvMaxSpd: Int
        get() = 223
    override val initLvMinHp: Int
        get() = 43
    override val initLvMinAtk: Int
        get() = 10
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1248
    override val maxLvMinAtk: Int
        get() = 291
    override val maxLvMinDef: Int
        get() = 156
    override val maxLvMinSpd: Int
        get() = 192
    override val minAllGrowth: Double
        get() = 4.480
    override val maxAllGrowth: Double
        get() = 5.187
}