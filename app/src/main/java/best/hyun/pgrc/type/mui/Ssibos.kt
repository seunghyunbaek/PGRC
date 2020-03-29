package best.hyun.pgrc.type.mui

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Ssibos : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_ssibos)
    override val type: PET_TYPE
        get() = PET_TYPE.MUI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_ssibos)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.EARTH
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 50
    override val initLvMaxAtk: Int
        get() = 10
    override val initLvMaxDef: Int
        get() = 8
    override val initLvMaxSpd: Int
        get() = 4
    override val maxLvMaxHp: Int
        get() = 1579
    override val maxLvMaxAtk: Int
        get() = 321
    override val maxLvMaxDef: Int
        get() = 266
    override val maxLvMaxSpd: Int
        get() = 127
    override val initLvMinHp: Int
        get() = 40
    override val initLvMinAtk: Int
        get() = 8
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 2
    override val maxLvMinHp: Int
        get() = 1370
    override val maxLvMinAtk: Int
        get() = 283
    override val maxLvMinDef: Int
        get() = 228
    override val maxLvMinSpd: Int
        get() = 95
    override val minAllGrowth: Double
        get() = 4.275
    override val maxAllGrowth: Double
        get() = 4.982
}