package best.hyun.pgrc.type.gigaros

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Teraros : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_teraros)
    override val type: PET_TYPE
        get() = PET_TYPE.GIGAROS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_teraros)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = null
    override val mainElementalValue: Int
        get() = 100
    override val subElementalValue: Int
        get() = 0
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 67
    override val initLvMaxAtk: Int
        get() = 11
    override val initLvMaxDef: Int
        get() = 12
    override val initLvMaxSpd: Int
        get() = 4
    override val maxLvMaxHp: Int
        get() = 1787
    override val maxLvMaxAtk: Int
        get() = 292
    override val maxLvMaxDef: Int
        get() = 322
    override val maxLvMaxSpd: Int
        get() = 120
    override val initLvMinHp: Int
        get() = 55
    override val initLvMinAtk: Int
        get() = 8
    override val initLvMinDef: Int
        get() = 10
    override val initLvMinSpd: Int
        get() = 3
    override val maxLvMinHp: Int
        get() = 1577
    override val maxLvMinAtk: Int
        get() = 253
    override val maxLvMinDef: Int
        get() = 284
    override val maxLvMinSpd: Int
        get() = 89
    override val minAllGrowth: Double
        get() = 4.394
    override val maxAllGrowth: Double
        get() = 5.101
}