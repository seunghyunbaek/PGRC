package best.hyun.pgrc.type.daino

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Daino : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_daino)
    override val type: PET_TYPE
        get() = PET_TYPE.DAINO
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_daino)
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
        get() = 64
    override val initLvMaxAtk: Int
        get() = 10
    override val initLvMaxDef: Int
        get() = 11
    override val initLvMaxSpd: Int
        get() = 3
    override val maxLvMaxHp: Int
        get() = 1691
    override val maxLvMaxAtk: Int
        get() = 274
    override val maxLvMaxDef: Int
        get() = 311
    override val maxLvMaxSpd: Int
        get() = 72
    override val initLvMinHp: Int
        get() = 51
    override val initLvMinAtk: Int
        get() = 8
    override val initLvMinDef: Int
        get() = 9
    override val initLvMinSpd: Int
        get() = 1
    override val maxLvMinHp: Int
        get() = 1481
    override val maxLvMinAtk: Int
        get() = 236
    override val maxLvMinDef: Int
        get() = 273
    override val maxLvMinSpd: Int
        get() = 41
    override val minAllGrowth: Double
        get() = 3.862
    override val maxAllGrowth: Double
        get() = 4.569
}