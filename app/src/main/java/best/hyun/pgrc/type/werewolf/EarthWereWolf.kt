package best.hyun.pgrc.type.werewolf

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class EarthWereWolf : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_earthwerewolf)
    override val type: PET_TYPE
        get() = PET_TYPE.WEREWOLF
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_earthwerewolf)
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
        get() = 62
    override val initLvMaxAtk: Int
        get() = 15
    override val initLvMaxDef: Int
        get() = 10
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1583
    override val maxLvMaxAtk: Int
        get() = 385
    override val maxLvMaxDef: Int
        get() = 274
    override val maxLvMaxSpd: Int
        get() = 196
    override val initLvMinHp: Int
        get() = 49
    override val initLvMinAtk: Int
        get() = 12
    override val initLvMinDef: Int
        get() = 8
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1373
    override val maxLvMinAtk: Int
        get() = 347
    override val maxLvMinDef: Int
        get() = 235
    override val maxLvMinSpd: Int
        get() = 165
    override val minAllGrowth: Double
        get() = 5.221
    override val maxAllGrowth: Double
        get() = 5.928
}