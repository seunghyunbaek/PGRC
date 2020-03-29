package best.hyun.pgrc.type.ktarkas

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Kutas : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_kutas)
    override val type: PET_TYPE
        get() = PET_TYPE.KATARKAS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_kutas)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.FIRE
    override val mainElementalValue: Int
        get() = 60
    override val subElementalValue: Int
        get() = 40
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 47
    override val initLvMaxAtk: Int
        get() = 8
    override val initLvMaxDef: Int
        get() = 9
    override val initLvMaxSpd: Int
        get() = 2
    override val maxLvMaxHp: Int
        get() = 1574
    override val maxLvMaxAtk: Int
        get() = 275
    override val maxLvMaxDef: Int
        get() = 323
    override val maxLvMaxSpd: Int
        get() = 81
    override val initLvMinHp: Int
        get() = 36
    override val initLvMinAtk: Int
        get() = 6
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 1
    override val maxLvMinHp: Int
        get() = 1342
    override val maxLvMinAtk: Int
        get() = 233
    override val maxLvMinDef: Int
        get() = 281
    override val maxLvMinSpd: Int
        get() = 46
    override val minAllGrowth: Double
        get() = 3.962
    override val maxAllGrowth: Double
        get() = 4.753
}