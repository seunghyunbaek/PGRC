package best.hyun.pgrc.type.manmo

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Manmo : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_manmo)
    override val type: PET_TYPE
        get() = PET_TYPE.MANMO
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_manmo)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 90
    override val subElementalValue: Int
        get() = 10
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 78
    override val initLvMaxAtk: Int
        get() = 10
    override val initLvMaxDef: Int
        get() = 8
    override val initLvMaxSpd: Int
        get() = 3
    override val maxLvMaxHp: Int
        get() = 2007
    override val maxLvMaxAtk: Int
        get() = 269
    override val maxLvMaxDef: Int
        get() = 204
    override val maxLvMaxSpd: Int
        get() = 90
    override val initLvMinHp: Int
        get() = 65
    override val initLvMinAtk: Int
        get() = 8
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 1
    override val maxLvMinHp: Int
        get() = 1789
    override val maxLvMinAtk: Int
        get() = 229
    override val maxLvMinDef: Int
        get() = 165
    override val maxLvMinSpd: Int
        get() = 57
    override val minAllGrowth: Double
        get() = 3.174
    override val maxAllGrowth: Double
        get() = 3.909
}