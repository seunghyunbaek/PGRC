package best.hyun.pgrc.type.godsnake

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Burori : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_burori)
    override val type: PET_TYPE
        get() = PET_TYPE.GODSNAKE
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_burori)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.FIRE
    override val mainElementalValue: Int
        get() = 90
    override val subElementalValue: Int
        get() = 10
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 62
    override val initLvMaxAtk: Int
        get() = 14
    override val initLvMaxDef: Int
        get() = 10
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLvMaxHp: Int
        get() = 1538
    override val maxLvMaxAtk: Int
        get() = 355
    override val maxLvMaxDef: Int
        get() = 250
    override val maxLvMaxSpd: Int
        get() = 169
    override val initLvMinHp: Int
        get() = 62
    override val initLvMinAtk: Int
        get() = 14
    override val initLvMinDef: Int
        get() = 10
    override val initLvMinSpd: Int
        get() = 7
    override val maxLvMinHp: Int
        get() = 1327
    override val maxLvMinAtk: Int
        get() = 317
    override val maxLvMinDef: Int
        get() = 212
    override val maxLvMinSpd: Int
        get() = 137
    override val minAllGrowth: Double
        get() = 4.655
    override val maxAllGrowth: Double
        get() = 5.362
}