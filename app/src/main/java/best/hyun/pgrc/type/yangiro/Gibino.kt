package best.hyun.pgrc.type.yangiro

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Gibino : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_gibino)
    override val type: PET_TYPE
        get() = PET_TYPE.YANGIRO
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.name_gibino)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val initLvMaxHp: Int
        get() = 64
    override val initLvMaxAtk: Int
        get() = 15
    override val initLvMaxDef: Int
        get() = 9
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1480
    override val maxLvMaxAtk: Int
        get() = 366
    override val maxLvMaxDef: Int
        get() = 211
    override val maxLvMaxSpd: Int
        get() = 190
    override val minAllGrowth: Double
        get() = 4.584
    override val maxAllGrowth: Double
        get() = 5.291
    override val initLvMinHp: Int
        get() = 50
    override val initLvMinAtk: Int
        get() = 13
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1269
    override val maxLvMinAtk: Int
        get() = 327
    override val maxLvMinDef: Int
        get() = 172
    override val maxLvMinSpd: Int
        get() = 158
}