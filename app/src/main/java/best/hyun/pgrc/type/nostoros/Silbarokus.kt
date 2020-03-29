package best.hyun.pgrc.type.nostoros

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Silbarokus : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_silbarokus)
    override val type: PET_TYPE
        get() = PET_TYPE.NOSTOROS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_silbarokus)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
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
        get() = 9
    override val initLvMaxSpd: Int
        get() = 6
    override val maxLvMaxHp: Int
        get() = 1472
    override val maxLvMaxAtk: Int
        get() = 333
    override val maxLvMaxDef: Int
        get() = 253
    override val maxLvMaxSpd: Int
        get() = 175
    override val initLvMinHp: Int
        get() = 43
    override val initLvMinAtk: Int
        get() = 10
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1262
    override val maxLvMinAtk: Int
        get() = 295
    override val maxLvMinDef: Int
        get() = 215
    override val maxLvMinSpd: Int
        get() = 144
    override val minAllGrowth: Double
        get() = 4.584
    override val maxAllGrowth: Double
        get() = 5.291
}