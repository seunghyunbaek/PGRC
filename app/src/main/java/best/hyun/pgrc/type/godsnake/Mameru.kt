package best.hyun.pgrc.type.godsnake

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Mameru : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_mameru)
    override val type: PET_TYPE
        get() = PET_TYPE.GODSNAKE
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_mameru)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 90
    override val subElementalValue: Int
        get() = 10
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 59
    override val initLvMaxAtk: Int
        get() = 15
    override val initLvMaxDef: Int
        get() = 10
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLvMaxHp: Int
        get() = 1462
    override val maxLvMaxAtk: Int
        get() = 374
    override val maxLvMaxDef: Int
        get() = 250
    override val maxLvMaxSpd: Int
        get() = 183
    override val initLvMinHp: Int
        get() = 46
    override val initLvMinAtk: Int
        get() = 12
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1252
    override val maxLvMinAtk: Int
        get() = 335
    override val maxLvMinDef: Int
        get() = 212
    override val maxLvMinSpd: Int
        get() = 151
    override val minAllGrowth: Double
        get() = 4.879
    override val maxAllGrowth: Double
        get() = 5.586
}