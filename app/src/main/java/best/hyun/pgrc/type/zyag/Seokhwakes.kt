package best.hyun.pgrc.type.zyag

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Seokhwakes : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_seokhwakes)
    override val type: PET_TYPE
        get() = PET_TYPE.ZYAG
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_seokhwakes)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.FIRE
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 62
    override val initLvMaxAtk: Int
        get() = 13
    override val initLvMaxDef: Int
        get() = 9
    override val initLvMaxSpd: Int
        get() = 6
    override val maxLvMaxHp: Int
        get() = 1650
    override val maxLvMaxAtk: Int
        get() = 364
    override val maxLvMaxDef: Int
        get() = 259
    override val maxLvMaxSpd: Int
        get() = 162
    override val initLvMinHp: Int
        get() = 50
    override val initLvMinAtk: Int
        get() = 11
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 4
    override val maxLvMinHp: Int
        get() = 1440
    override val maxLvMinAtk: Int
        get() = 326
    override val maxLvMinDef: Int
        get() = 221
    override val maxLvMinSpd: Int
        get() = 130
    override val minAllGrowth: Double
        get() = 4.746
    override val maxAllGrowth: Double
        get() = 5.453
}