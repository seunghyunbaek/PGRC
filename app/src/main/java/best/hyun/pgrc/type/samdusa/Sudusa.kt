package best.hyun.pgrc.type.samdusa

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Sudusa : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_sudusa)
    override val type: PET_TYPE
        get() = PET_TYPE.SAMDUSA
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_sudusa)
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
        get() = 65
    override val initLvMaxAtk: Int
        get() = 15
    override val initLvMaxDef: Int
        get() = 11
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLvMaxHp: Int
        get() = 1554
    override val maxLvMaxAtk: Int
        get() = 371
    override val maxLvMaxDef: Int
        get() = 266
    override val maxLvMaxSpd: Int
        get() = 183
    override val initLvMinHp: Int
        get() = 52
    override val initLvMinAtk: Int
        get() = 13
    override val initLvMinDef: Int
        get() = 8
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1343
    override val maxLvMinAtk: Int
        get() = 333
    override val maxLvMinDef: Int
        get() = 227
    override val maxLvMinSpd: Int
        get() = 151
    override val minAllGrowth: Double
        get() = 4.959
    override val maxAllGrowth: Double
        get() = 5.666
}