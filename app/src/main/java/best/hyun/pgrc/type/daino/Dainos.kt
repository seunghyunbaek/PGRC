package best.hyun.pgrc.type.daino

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Dainos : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_dainos)
    override val type: PET_TYPE
        get() = PET_TYPE.DAINO
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_dainos)
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
        get() = 68
    override val initLvMaxAtk: Int
        get() = 9
    override val initLvMaxDef: Int
        get() = 11
    override val initLvMaxSpd: Int
        get() = 3
    override val maxLvMaxHp: Int
        get() = 1748
    override val maxLvMaxAtk: Int
        get() = 249
    override val maxLvMaxDef: Int
        get() = 304
    override val maxLvMaxSpd: Int
        get() = 79
    override val initLvMinHp: Int
        get() = 55
    override val initLvMinAtk: Int
        get() = 7
    override val initLvMinDef: Int
        get() = 9
    override val initLvMinSpd: Int
        get() = 1
    override val maxLvMinHp: Int
        get() = 1538
    override val maxLvMinAtk: Int
        get() = 210
    override val maxLvMinDef: Int
        get() = 266
    override val maxLvMinSpd: Int
        get() = 48
    override val minAllGrowth: Double
        get() = 3.682
    override val maxAllGrowth: Double
        get() = 4.389
}