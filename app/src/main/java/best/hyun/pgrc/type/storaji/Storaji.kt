package best.hyun.pgrc.type.storaji

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Storaji : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_storaji)
    override val type: PET_TYPE
        get() = PET_TYPE.STORAJI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_storaji)
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
        get() = 52
    override val initLvMaxAtk: Int
        get() = 9
    override val initLvMaxDef: Int
        get() = 7
    override val initLvMaxSpd: Int
        get() = 5
    override val maxLvMaxHp: Int
        get() = 1640
    override val maxLvMaxAtk: Int
        get() = 301
    override val maxLvMaxDef: Int
        get() = 233
    override val maxLvMaxSpd: Int
        get() = 161
    override val initLvMinHp: Int
        get() = 42
    override val initLvMinAtk: Int
        get() = 7
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 3
    override val maxLvMinHp: Int
        get() = 1431
    override val maxLvMinAtk: Int
        get() = 263
    override val maxLvMinDef: Int
        get() = 195
    override val maxLvMinSpd: Int
        get() = 129
    override val minAllGrowth: Double
        get() = 4.147
    override val maxAllGrowth: Double
        get() = 4.854
}