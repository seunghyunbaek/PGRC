package best.hyun.pgrc.type.yangiro

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Bangino : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_bangino)
    override val type: PET_TYPE
        get() = PET_TYPE.YANGIRO
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.name_bangino)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = null
    override val mainElementalValue: Int
        get() = 100
    override val subElementalValue: Int
        get() = 0
    override val initLv: Int
        get() = 1
    override val initLvMaxHp: Int
        get() = 55
    override val initLvMaxAtk: Int
        get() = 13
    override val initLvMaxDef: Int
        get() = 8
    override val initLvMaxSpd: Int
        get() = 6
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1454
    override val maxLvMaxAtk: Int
        get() = 355
    override val maxLvMaxDef: Int
        get() = 207
    override val maxLvMaxSpd: Int
        get() = 175
    override val minAllGrowth: Double
        get() = 4.387
    override val maxAllGrowth: Double
        get() = 5.122
    override val initLvMinHp: Int
        get() = 42
    override val initLvMinAtk: Int
        get() = 11
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 4
    override val maxLvMinHp: Int
        get() = 1237
    override val maxLvMinAtk: Int
        get() = 315
    override val maxLvMinDef: Int
        get() = 167
    override val maxLvMinSpd: Int
        get() = 143
}