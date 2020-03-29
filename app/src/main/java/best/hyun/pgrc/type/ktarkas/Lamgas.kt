package best.hyun.pgrc.type.ktarkas

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Lamgas : Pet() {
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
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 60
    override val subElementalValue: Int
        get() = 40
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 58
    override val initLvMaxAtk: Int
        get() = 7
    override val initLvMaxDef: Int
        get() = 6
    override val initLvMaxSpd: Int
        get() = 4
    override val maxLvMaxHp: Int
        get() = 1908
    override val maxLvMaxAtk: Int
        get() = 246
    override val maxLvMaxDef: Int
        get() = 213
    override val maxLvMaxSpd: Int
        get() = 130
    override val initLvMinHp: Int
        get() = 48
    override val initLvMinAtk: Int
        get() = 5
    override val initLvMinDef: Int
        get() = 4
    override val initLvMinSpd: Int
        get() = 2
    override val maxLvMinHp: Int
        get() = 1684
    override val maxLvMinAtk: Int
        get() = 205
    override val maxLvMinDef: Int
        get() = 172
    override val maxLvMinSpd: Int
        get() = 96
    override val minAllGrowth: Double
        get() = 3.355
    override val maxAllGrowth: Double
        get() = 4.118
}