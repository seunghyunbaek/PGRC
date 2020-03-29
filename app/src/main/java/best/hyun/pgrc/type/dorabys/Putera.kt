package best.hyun.pgrc.type.dorabys

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Putera : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_putera)
    override val type: PET_TYPE
        get() = PET_TYPE.DORABYS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_putera)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.FIRE
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 61
    override val initLvMaxAtk: Int
        get() = 14
    override val initLvMaxDef: Int
        get() = 9
    override val initLvMaxSpd: Int
        get() = 9
    override val maxLvMaxHp: Int
        get() = 1457
    override val maxLvMaxAtk: Int
        get() = 345
    override val maxLvMaxDef: Int
        get() = 209
    override val maxLvMaxSpd: Int
        get() = 217
    override val initLvMinHp: Int
        get() = 48
    override val initLvMinAtk: Int
        get() = 12
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 7
    override val maxLvMinHp: Int
        get() = 1247
    override val maxLvMinAtk: Int
        get() = 307
    override val maxLvMinDef: Int
        get() = 170
    override val maxLvMinSpd: Int
        get() = 186
    override val minAllGrowth: Double
        get() = 4.627
    override val maxAllGrowth: Double
        get() = 5.334
}