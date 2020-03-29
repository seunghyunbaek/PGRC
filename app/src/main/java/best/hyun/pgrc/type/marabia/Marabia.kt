package best.hyun.pgrc.type.marabia

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber


class Marabia : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_marabia)
    override val type: PET_TYPE
        get() = PET_TYPE.MARABIA
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_marabia)
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
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 43
    override val initLvMaxAtk: Int
        get() = 7
    override val initLvMaxDef: Int
        get() = 7
    override val initLvMaxSpd: Int
        get() = 6
    override val maxLvMaxHp: Int
        get() = 1413
    override val maxLvMaxAtk: Int
        get() = 251
    override val maxLvMaxDef: Int
        get() = 251
    override val maxLvMaxSpd: Int
        get() = 201
    override val initLvMinHp: Int
        get() = 33
    override val initLvMinAtk: Int
        get() = 6
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 4
    override val maxLvMinHp: Int
        get() = 1205
    override val maxLvMinAtk: Int
        get() = 213
    override val maxLvMinDef: Int
        get() = 213
    override val maxLvMinSpd: Int
        get() = 170
    override val minAllGrowth: Double
        get() = 4.218
    override val maxAllGrowth: Double
        get() = 4.925
}