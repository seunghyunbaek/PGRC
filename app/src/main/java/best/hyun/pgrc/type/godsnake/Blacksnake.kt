package best.hyun.pgrc.type.godsnake

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Blacksnake : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_blacksnake)
    override val type: PET_TYPE
        get() = PET_TYPE.GODSNAKE
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_blacksnake)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 50
    override val subElementalValue: Int
        get() = 50
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 64
    override val initLvMaxAtk: Int
        get() = 16
    override val initLvMaxDef: Int
        get() = 10
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLvMaxHp: Int
        get() = 1473
    override val maxLvMaxAtk: Int
        get() = 375
    override val maxLvMaxDef: Int
        get() = 245
    override val maxLvMaxSpd: Int
        get() = 197
    override val initLvMinHp: Int
        get() = 50
    override val initLvMinAtk: Int
        get() = 13
    override val initLvMinDef: Int
        get() = 8
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1262
    override val maxLvMinAtk: Int
        get() = 336
    override val maxLvMinDef: Int
        get() = 206
    override val maxLvMinSpd: Int
        get() = 165
    override val minAllGrowth: Double
        get() = 4.931
    override val maxAllGrowth: Double
        get() = 5.638
}