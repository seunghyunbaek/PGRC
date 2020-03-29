package best.hyun.pgrc.type.berga

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Berga : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_berga)
    override val type: PET_TYPE
        get() = PET_TYPE.BERGA
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_berga)
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
        get() = 48
    override val initLvMaxAtk: Int
        get() = 9
    override val initLvMaxDef: Int
        get() = 7
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLvMaxHp: Int
        get() = 1433
    override val maxLvMaxAtk: Int
        get() = 287
    override val maxLvMaxDef: Int
        get() = 207
    override val maxLvMaxSpd: Int
        get() = 219
    override val initLvMinHp: Int
        get() = 36
    override val initLvMinAtk: Int
        get() = 7
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1208
    override val maxLvMinAtk: Int
        get() = 246
    override val maxLvMinDef: Int
        get() = 166
    override val maxLvMinSpd: Int
        get() = 185
    override val minAllGrowth: Double
        get() = 4.215
    override val maxAllGrowth: Double
        get() = 4.978
}