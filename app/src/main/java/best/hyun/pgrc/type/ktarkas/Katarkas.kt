package best.hyun.pgrc.type.ktarkas

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Katarkas : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_katarkas)
    override val type: PET_TYPE
        get() = PET_TYPE.KATARKAS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_katarkas)
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
        get() = 46
    override val initLvMaxAtk: Int
        get() = 8
    override val initLvMaxDef: Int
        get() = 11
    override val initLvMaxSpd: Int
        get() = 2
    override val maxLvMaxHp: Int
        get() = 1488
    override val maxLvMaxAtk: Int
        get() = 262
    override val maxLvMaxDef: Int
        get() = 375
    override val maxLvMaxSpd: Int
        get() = 78
    override val initLvMinHp: Int
        get() = 35
    override val initLvMinAtk: Int
        get() = 6
    override val initLvMinDef: Int
        get() = 9
    override val initLvMinSpd: Int
        get() = 1
    override val maxLvMinHp: Int
        get() = 1263
    override val maxLvMinAtk: Int
        get() = 221
    override val maxLvMinDef: Int
        get() = 334
    override val maxLvMinSpd: Int
        get() = 44
    override val minAllGrowth: Double
        get() = 4.235
    override val maxAllGrowth: Double
        get() = 4.998
}