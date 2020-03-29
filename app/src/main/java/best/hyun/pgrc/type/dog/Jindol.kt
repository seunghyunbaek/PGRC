package best.hyun.pgrc.type.dog

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Jindol : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_jindol)
    override val type: PET_TYPE
        get() = PET_TYPE.DOG
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_jindol)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 90
    override val subElementalValue: Int
        get() = 10
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 82
    override val initLvMaxAtk: Int
        get() = 20
    override val initLvMaxDef: Int
        get() = 13
    override val initLvMaxSpd: Int
        get() = 10
    override val maxLvMaxHp: Int
        get() = 1523
    override val maxLvMaxAtk: Int
        get() = 387
    override val maxLvMaxDef: Int
        get() = 255
    override val maxLvMaxSpd: Int
        get() = 192
    override val initLvMinHp: Int
        get() = 64
    override val initLvMinAtk: Int
        get() = 17
    override val initLvMinDef: Int
        get() = 10
    override val initLvMinSpd: Int
        get() = 7
    override val maxLvMinHp: Int
        get() = 1310
    override val maxLvMinAtk: Int
        get() = 348
    override val maxLvMinDef: Int
        get() = 216
    override val maxLvMinSpd: Int
        get() = 160
    override val minAllGrowth: Double
        get() = 4.993
    override val maxAllGrowth: Double
        get() = 5.700
}