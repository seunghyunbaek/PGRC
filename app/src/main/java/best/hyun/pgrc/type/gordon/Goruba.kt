package best.hyun.pgrc.type.gordon

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Goruba : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_goruba)
    override val type: PET_TYPE
        get() = PET_TYPE.GORDON
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_goruba)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 66
    override val initLvMaxAtk: Int
        get() = 16
    override val initLvMaxDef: Int
        get() = 11
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLvMaxHp: Int
        get() = 1521
    override val maxLvMaxAtk: Int
        get() = 383
    override val maxLvMaxDef: Int
        get() = 253
    override val maxLvMaxSpd: Int
        get() = 176
    override val initLvMinHp: Int
        get() = 52
    override val initLvMinAtk: Int
        get() = 14
    override val initLvMinDef: Int
        get() = 8
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1310
    override val maxLvMinAtk: Int
        get() = 344
    override val maxLvMinDef: Int
        get() = 214
    override val maxLvMinSpd: Int
        get() = 145
    override val minAllGrowth: Double
        get() = 4.898
    override val maxAllGrowth: Double
        get() = 5.605
}