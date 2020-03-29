package best.hyun.pgrc.type.dog

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Mongdol : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_mongdol)
    override val type: PET_TYPE
        get() = PET_TYPE.DOG
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_mongdol)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.FIRE
    override val mainElementalValue: Int
        get() = 90
    override val subElementalValue: Int
        get() = 10
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 79
    override val initLvMaxAtk: Int
        get() = 19
    override val initLvMaxDef: Int
        get() = 13
    override val initLvMaxSpd: Int
        get() = 12
    override val maxLvMaxHp: Int
        get() = 1481
    override val maxLvMaxAtk: Int
        get() = 366
    override val maxLvMaxDef: Int
        get() = 247
    override val maxLvMaxSpd: Int
        get() = 234
    override val initLvMinHp: Int
        get() = 62
    override val initLvMinAtk: Int
        get() = 16
    override val initLvMinDef: Int
        get() = 10
    override val initLvMinSpd: Int
        get() = 10
    override val maxLvMinHp: Int
        get() = 1268
    override val maxLvMinAtk: Int
        get() = 327
    override val maxLvMinDef: Int
        get() = 208
    override val maxLvMinSpd: Int
        get() = 202
    override val minAllGrowth: Double
        get() = 5.078
    override val maxAllGrowth: Double
        get() = 5.785
}