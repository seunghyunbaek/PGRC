package best.hyun.pgrc.type.beron

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Beroboku : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_beroboku)
    override val type: PET_TYPE
        get() = PET_TYPE.BERON
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_beroboku)
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
        get() = 53
    override val initLvMaxAtk: Int
        get() = 11
    override val initLvMaxDef: Int
        get() = 8
    override val initLvMaxSpd: Int
        get() = 5
    override val maxLvMaxHp: Int
        get() = 1515
    override val maxLvMaxAtk: Int
        get() = 339
    override val maxLvMaxDef: Int
        get() = 247
    override val maxLvMaxSpd: Int
        get() = 141
    override val initLvMinHp: Int
        get() = 41
    override val initLvMinAtk: Int
        get() = 9
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 3
    override val maxLvMinHp: Int
        get() = 1306
    override val maxLvMinAtk: Int
        get() = 301
    override val maxLvMinDef: Int
        get() = 208
    override val maxLvMinSpd: Int
        get() = 109
    override val minAllGrowth: Double
        get() = 4.351
    override val maxAllGrowth: Double
        get() = 5.058
}