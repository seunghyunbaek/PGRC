package best.hyun.pgrc.type.gordon

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Gorgo : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_gorgo)
    override val type: PET_TYPE
        get() = PET_TYPE.GORDON
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_gorgo)
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
        get() = 60
    override val initLvMaxAtk: Int
        get() = 14
    override val initLvMaxDef: Int
        get() = 9
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLvMaxHp: Int
        get() = 1469
    override val maxLvMaxAtk: Int
        get() = 346
    override val maxLvMaxDef: Int
        get() = 241
    override val maxLvMaxSpd: Int
        get() = 169
    override val initLvMinHp: Int
        get() = 46
    override val initLvMinAtk: Int
        get() = 11
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1258
    override val maxLvMinAtk: Int
        get() = 308
    override val maxLvMinDef: Int
        get() = 203
    override val maxLvMinSpd: Int
        get() = 137
    override val minAllGrowth: Double
        get() = 4.532
    override val maxAllGrowth: Double
        get() = 5.239
}