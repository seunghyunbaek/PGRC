package best.hyun.pgrc.type.lagogo

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Lagogo : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_lagogo)
    override val type: PET_TYPE
        get() = PET_TYPE.LAGOGO
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_lagogo)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
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
        get() = 49
    override val initLvMaxAtk: Int
        get() = 11
    override val initLvMaxDef: Int
        get() = 6
    override val initLvMaxSpd: Int
        get() = 6
    override val maxLvMaxHp: Int
        get() = 1399
    override val maxLvMaxAtk: Int
        get() = 340
    override val maxLvMaxDef: Int
        get() = 192
    override val maxLvMaxSpd: Int
        get() = 182
    override val initLvMinHp: Int
        get() = 37
    override val initLvMinAtk: Int
        get() = 9
    override val initLvMinDef: Int
        get() = 4
    override val initLvMinSpd: Int
        get() = 4
    override val maxLvMinHp: Int
        get() = 1190
    override val maxLvMinAtk: Int
        get() = 301
    override val maxLvMinDef: Int
        get() = 154
    override val maxLvMinSpd: Int
        get() = 150
    override val minAllGrowth: Double
        get() = 4.261
    override val maxAllGrowth: Double
        get() = 4.968
}