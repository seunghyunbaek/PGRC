package best.hyun.pgrc.type.gigaros

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Megaros : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_megaros)
    override val type: PET_TYPE
        get() = PET_TYPE.GIGAROS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_megaros)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.EARTH
    override val mainElementalValue: Int
        get() = 60
    override val subElementalValue: Int
        get() = 40
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 59
    override val initLvMaxAtk: Int
        get() = 11
    override val initLvMaxDef: Int
        get() = 10
    override val initLvMaxSpd: Int
        get() = 4
    override val maxLvMaxHp: Int
        get() = 1640
    override val maxLvMaxAtk: Int
        get() = 312
    override val maxLvMaxDef: Int
        get() = 300
    override val maxLvMaxSpd: Int
        get() = 107
    override val initLvMinHp: Int
        get() = 48
    override val initLvMinAtk: Int
        get() = 9
    override val initLvMinDef: Int
        get() = 8
    override val initLvMinSpd: Int
        get() = 2
    override val maxLvMinHp: Int
        get() = 1431
    override val maxLvMinAtk: Int
        get() = 274
    override val maxLvMinDef: Int
        get() = 262
    override val maxLvMinSpd: Int
        get() = 75
    override val minAllGrowth: Double
        get() = 4.294
    override val maxAllGrowth: Double
        get() = 5.001
}