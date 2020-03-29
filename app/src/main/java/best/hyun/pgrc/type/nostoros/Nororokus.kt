package best.hyun.pgrc.type.nostoros

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Nororokus : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_nororokus)
    override val type: PET_TYPE
        get() = PET_TYPE.NOSTOROS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_nororokus)
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
        get() = 56
    override val initLvMaxAtk: Int
        get() = 12
    override val initLvMaxDef: Int
        get() = 8
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLvMaxHp: Int
        get() = 1472
    override val maxLvMaxAtk: Int
        get() = 338
    override val maxLvMaxDef: Int
        get() = 227
    override val maxLvMaxSpd: Int
        get() = 196
    override val initLvMinHp: Int
        get() = 43
    override val initLvMinAtk: Int
        get() = 10
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1262
    override val maxLvMinAtk: Int
        get() = 300
    override val maxLvMinDef: Int
        get() = 189
    override val maxLvMinSpd: Int
        get() = 164
    override val minAllGrowth: Double
        get() = 4.584
    override val maxAllGrowth: Double
        get() = 5.291
}