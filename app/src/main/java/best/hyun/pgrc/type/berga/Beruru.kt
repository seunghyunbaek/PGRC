package best.hyun.pgrc.type.berga

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Beruru : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_beruru)
    override val type: PET_TYPE
        get() = PET_TYPE.BERGA
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_beruru)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.FIRE
    override val mainElementalValue: Int
        get() = 70
    override val subElementalValue: Int
        get() = 30
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 45
    override val initLvMaxAtk: Int
        get() = 9
    override val initLvMaxDef: Int
        get() = 6
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLvMaxHp: Int
        get() = 1386
    override val maxLvMaxAtk: Int
        get() = 299
    override val maxLvMaxDef: Int
        get() = 186
    override val maxLvMaxSpd: Int
        get() = 241
    override val initLvMinHp: Int
        get() = 34
    override val initLvMinAtk: Int
        get() = 7
    override val initLvMinDef: Int
        get() = 4
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1162
    override val maxLvMinAtk: Int
        get() = 258
    override val maxLvMinDef: Int
        get() = 145
    override val maxLvMinSpd: Int
        get() = 207
    override val minAllGrowth: Double
        get() = 4.308
    override val maxAllGrowth: Double
        get() = 5.071
}