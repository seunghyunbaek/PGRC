package best.hyun.pgrc.type.special

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber


class Fywable : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_fywable)
    override val type: PET_TYPE
        get() = PET_TYPE.SPECIAL
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_fywable)
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
    override val initLvMaxHp: Int
        get() = 75
    override val initLvMaxAtk: Int
        get() = 19
    override val initLvMaxDef: Int
        get() = 13
    override val initLvMaxSpd: Int
        get() = 9
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1570
    override val maxLvMaxAtk: Int
        get() = 400
    override val maxLvMaxDef: Int
        get() = 270
    override val maxLvMaxSpd: Int
        get() = 191
    override val initLvMinHp: Int
        get() = 59
    override val initLvMinAtk: Int
        get() = 16
    override val initLvMinDef: Int
        get() = 10
    override val initLvMinSpd: Int
        get() = 7
    override val maxLvMinHp: Int
        get() = 1358
    override val maxLvMinAtk: Int
        get() = 362
    override val maxLvMinDef: Int
        get() = 231
    override val maxLvMinSpd: Int
        get() = 159
    override val minAllGrowth: Double
        get() = 5.211
    override val maxAllGrowth: Double
        get() = 5.918
}