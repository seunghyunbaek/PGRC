package best.hyun.pgrc.type.yangiro

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Burudon: Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_burudon)
    override val type: PET_TYPE
        get() = PET_TYPE.YANGIRO
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.name_burudon)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 20
    override val subElementalValue: Int
        get() = 80
    override val initLv: Int
        get() = 1
    override val initLvMaxHp: Int
        get() = 55
    override val initLvMaxAtk: Int
        get() = 12
    override val initLvMaxDef: Int
        get() = 7
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1451
    override val maxLvMaxAtk: Int
        get() = 342
    override val maxLvMaxDef: Int
        get() = 188
    override val maxLvMaxSpd: Int
        get() = 210
    override val minAllGrowth: Double
        get() = 4.427
    override val maxAllGrowth: Double
        get() = 5.134
    override val initLvMinHp: Int
        get() = 43
    override val initLvMinAtk: Int
        get() = 10
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1241
    override val maxLvMinAtk: Int
        get() = 304
    override val maxLvMinDef: Int
        get() = 149
    override val maxLvMinSpd: Int
        get() = 178
}