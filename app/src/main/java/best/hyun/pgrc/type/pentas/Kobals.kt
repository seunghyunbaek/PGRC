package best.hyun.pgrc.type.pentas

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Kobals : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_kobals)
    override val type: PET_TYPE
        get() = PET_TYPE.PENTAS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_kobals)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
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
        get() = 46
    override val initLvMaxAtk: Int
        get() = 10
    override val initLvMaxDef: Int
        get() = 7
    override val initLvMaxSpd: Int
        get() = 4
    override val maxLvMaxHp: Int
        get() = 1529
    override val maxLvMaxAtk: Int
        get() = 339
    override val maxLvMaxDef: Int
        get() = 253
    override val maxLvMaxSpd: Int
        get() = 154
    override val initLvMinHp: Int
        get() = 37
    override val initLvMinAtk: Int
        get() = 8
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 3
    override val maxLvMinHp: Int
        get() = 1320
    override val maxLvMinAtk: Int
        get() = 301
    override val maxLvMinDef: Int
        get() = 256
    override val maxLvMinSpd: Int
        get() = 122
    override val minAllGrowth: Double
        get() = 4.508
    override val maxAllGrowth: Double
        get() = 5.215
}