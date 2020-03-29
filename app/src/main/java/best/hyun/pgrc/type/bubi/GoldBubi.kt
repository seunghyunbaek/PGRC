package best.hyun.pgrc.type.bubi

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber


class GoldBubi : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_goldbubi)
    override val type: PET_TYPE
        get() = PET_TYPE.BUBI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_goldbubi)
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
        get() = 57
    override val initLvMaxAtk: Int
        get() = 8
    override val initLvMaxDef: Int
        get() = 11
    override val initLvMaxSpd: Int
        get() = 4
    override val maxLvMaxHp: Int
        get() = 1574
    override val maxLvMaxAtk: Int
        get() = 232
    override val maxLvMaxDef: Int
        get() = 309
    override val maxLvMaxSpd: Int
        get() = 118
    override val initLvMinHp: Int
        get() = 45
    override val initLvMinAtk: Int
        get() = 6
    override val initLvMinDef: Int
        get() = 9
    override val initLvMinSpd: Int
        get() = 2
    override val maxLvMinHp: Int
        get() = 1356
    override val maxLvMinAtk: Int
        get() = 193
    override val maxLvMinDef: Int
        get() = 270
    override val maxLvMinSpd: Int
        get() = 86
    override val minAllGrowth: Double
        get() = 3.857
    override val maxAllGrowth: Double
        get() = 4.592
}