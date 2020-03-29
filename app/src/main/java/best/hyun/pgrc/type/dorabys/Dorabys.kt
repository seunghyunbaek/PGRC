package best.hyun.pgrc.type.dorabys

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Dorabys : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_dorabys)
    override val type: PET_TYPE
        get() = PET_TYPE.DORABYS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_dorabys)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
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
        get() = 48
    override val initLvMaxAtk: Int
        get() = 11
    override val initLvMaxDef: Int
        get() = 7
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLvMaxHp: Int
        get() = 1385
    override val maxLvMaxAtk: Int
        get() = 332
    override val maxLvMaxDef: Int
        get() = 211
    override val maxLvMaxSpd: Int
        get() = 223
    override val initLvMinHp: Int
        get() = 37
    override val initLvMinAtk: Int
        get() = 9
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1176
    override val maxLvMinAtk: Int
        get() = 284
    override val maxLvMinDef: Int
        get() = 173
    override val maxLvMinSpd: Int
        get() = 191
    override val minAllGrowth: Double
        get() = 4.556
    override val maxAllGrowth: Double
        get() = 5.263
}