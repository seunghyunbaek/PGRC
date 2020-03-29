package best.hyun.pgrc.type.beron

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Benoturi : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_benoturi)
    override val type: PET_TYPE
        get() = PET_TYPE.BERON
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_benoturi)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 70
    override val subElementalValue: Int
        get() = 30
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 58
    override val initLvMaxAtk: Int
        get() = 13
    override val initLvMaxDef: Int
        get() = 10
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLvMaxHp: Int
        get() = 1533
    override val maxLvMaxAtk: Int
        get() = 356
    override val maxLvMaxDef: Int
        get() = 263
    override val maxLvMaxSpd: Int
        get() = 182
    override val initLvMinHp: Int
        get() = 46
    override val initLvMinAtk: Int
        get() = 11
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1323
    override val maxLvMinAtk: Int
        get() = 317
    override val maxLvMinDef: Int
        get() = 225
    override val maxLvMinSpd: Int
        get() = 151
    override val minAllGrowth: Double
        get() = 4.855
    override val maxAllGrowth: Double
        get() = 5.562
}