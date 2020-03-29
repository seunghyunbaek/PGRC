package best.hyun.pgrc.type.manasipu

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Laihon : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_laihon)
    override val type: PET_TYPE
        get() = PET_TYPE.MONASIPU
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_laihon)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 50
    override val subElementalValue: Int
        get() = 50
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 67
    override val initLvMaxAtk: Int
        get() = 15
    override val initLvMaxDef: Int
        get() = 10
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLvMaxHp: Int
        get() = 1482
    override val maxLvMaxAtk: Int
        get() = 348
    override val maxLvMaxDef: Int
        get() = 229
    override val maxLvMaxSpd: Int
        get() = 190
    override val initLvMinHp: Int
        get() = 52
    override val initLvMinAtk: Int
        get() = 13
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1271
    override val maxLvMinAtk: Int
        get() = 309
    override val maxLvMinDef: Int
        get() = 191
    override val maxLvMinSpd: Int
        get() = 159
    override val minAllGrowth: Double
        get() = 4.584
    override val maxAllGrowth: Double
        get() = 5.291
}