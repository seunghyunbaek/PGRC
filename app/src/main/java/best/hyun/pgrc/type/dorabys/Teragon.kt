package best.hyun.pgrc.type.dorabys

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Teragon : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_teragon)
    override val type: PET_TYPE
        get() = PET_TYPE.DORABYS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_teragon)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
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
        get() = 56
    override val initLvMaxAtk: Int
        get() = 13
    override val initLvMaxDef: Int
        get() = 9
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLvMaxHp: Int
        get() = 1386
    override val maxLvMaxAtk: Int
        get() = 338
    override val maxLvMaxDef: Int
        get() = 226
    override val maxLvMaxSpd: Int
        get() = 217
    override val initLvMinHp: Int
        get() = 43
    override val initLvMinAtk: Int
        get() = 11
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 7
    override val maxLvMinHp: Int
        get() = 1176
    override val maxLvMinAtk: Int
        get() = 299
    override val maxLvMinDef: Int
        get() = 188
    override val maxLvMinSpd: Int
        get() = 185
    override val minAllGrowth: Double
        get() = 4.703
    override val maxAllGrowth: Double
        get() = 5.410
}