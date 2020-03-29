package best.hyun.pgrc.type.gordon

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Turdon : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_turdon)
    override val type: PET_TYPE
        get() = PET_TYPE.GORDON
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_turdon)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
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
        get() = 63
    override val initLvMaxAtk: Int
        get() = 13
    override val initLvMaxDef: Int
        get() = 9
    override val initLvMaxSpd: Int
        get() = 6
    override val maxLvMaxHp: Int
        get() = 1551
    override val maxLvMaxAtk: Int
        get() = 341
    override val maxLvMaxDef: Int
        get() = 236
    override val maxLvMaxSpd: Int
        get() = 155
    override val initLvMinHp: Int
        get() = 50
    override val initLvMinAtk: Int
        get() = 11
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 4
    override val maxLvMinHp: Int
        get() = 1341
    override val maxLvMinAtk: Int
        get() = 302
    override val maxLvMinDef: Int
        get() = 197
    override val maxLvMinSpd: Int
        get() = 124
    override val minAllGrowth: Double
        get() = 4.361
    override val maxAllGrowth: Double
        get() = 5.068
}