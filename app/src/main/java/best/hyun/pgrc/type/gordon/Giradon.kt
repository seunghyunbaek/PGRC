package best.hyun.pgrc.type.gordon

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Giradon : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_giradon)
    override val type: PET_TYPE
        get() = PET_TYPE.GORDON
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_giradon)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 53
    override val initLvMaxAtk: Int
        get() = 11
    override val initLvMaxDef: Int
        get() = 9
    override val initLvMaxSpd: Int
        get() = 5
    override val maxLvMaxHp: Int
        get() = 1522
    override val maxLvMaxAtk: Int
        get() = 327
    override val maxLvMaxDef: Int
        get() = 259
    override val maxLvMaxSpd: Int
        get() = 147
    override val initLvMinHp: Int
        get() = 42
    override val initLvMinAtk: Int
        get() = 9
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 3
    override val maxLvMinHp: Int
        get() = 1313
    override val maxLvMinAtk: Int
        get() = 289
    override val maxLvMinDef: Int
        get() = 221
    override val maxLvMinSpd: Int
        get() = 116
    override val minAllGrowth: Double
        get() = 4.404
    override val maxAllGrowth: Double
        get() = 5.111
}