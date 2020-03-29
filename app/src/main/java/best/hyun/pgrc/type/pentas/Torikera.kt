package best.hyun.pgrc.type.pentas

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Torikera : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_torikera)
    override val type: PET_TYPE
        get() = PET_TYPE.PENTAS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_torikera)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 70
    override val subElementalValue: Int
        get() = 30
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 41
    override val initLvMaxAtk: Int
        get() = 8
    override val initLvMaxDef: Int
        get() = 7
    override val initLvMaxSpd: Int
        get() = 3
    override val maxLvMaxHp: Int
        get() = 1484
    override val maxLvMaxAtk: Int
        get() = 325
    override val maxLvMaxDef: Int
        get() = 276
    override val maxLvMaxSpd: Int
        get() = 126
    override val initLvMinHp: Int
        get() = 32
    override val initLvMinAtk: Int
        get() = 7
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 2
    override val maxLvMinHp: Int
        get() = 1276
    override val maxLvMinAtk: Int
        get() = 287
    override val maxLvMinDef: Int
        get() = 238
    override val maxLvMinSpd: Int
        get() = 95
    override val minAllGrowth: Double
        get() = 4.394
    override val maxAllGrowth: Double
        get() = 5.101
}