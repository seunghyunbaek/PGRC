package best.hyun.pgrc.type.yangiro

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Rudon: Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_rudon)
    override val type: PET_TYPE
        get() = PET_TYPE.YANGIRO
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_rudon)
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
    override val initLvMaxHp: Int
        get() = 74
    override val initLvMaxAtk: Int
        get() = 17
    override val initLvMaxDef: Int
        get() = 10
    override val initLvMaxSpd: Int
        get() = 11
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1549
    override val maxLvMaxAtk: Int
        get() = 363
    override val maxLvMaxDef: Int
        get() = 214
    override val maxLvMaxSpd: Int
        get() = 232
    override val initLvMinHp: Int
        get() = 58
    override val initLvMinAtk: Int
        get() = 14
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 8
    override val maxLvMinHp: Int
        get() = 1337
    override val maxLvMinAtk: Int
        get() = 324
    override val maxLvMinDef: Int
        get() = 175
    override val maxLvMinSpd: Int
        get() = 201
    override val minAllGrowth: Double
        get() = 4.855
    override val maxAllGrowth: Double
        get() = 5.562
}