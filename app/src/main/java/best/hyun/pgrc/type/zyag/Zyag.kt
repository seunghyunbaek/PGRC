package best.hyun.pgrc.type.zyag

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Zyag : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_zyag)
    override val type: PET_TYPE
        get() = PET_TYPE.ZYAG
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_zyag)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
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
        get() = 53
    override val initLvMaxAtk: Int
        get() = 11
    override val initLvMaxDef: Int
        get() = 6
    override val initLvMaxSpd: Int
        get() = 5
    override val maxLvMaxHp: Int
        get() = 1522
    override val maxLvMaxAtk: Int
        get() = 322
    override val maxLvMaxDef: Int
        get() = 193
    override val maxLvMaxSpd: Int
        get() = 161
    override val initLvMinHp: Int
        get() = 42
    override val initLvMinAtk: Int
        get() = 9
    override val initLvMinDef: Int
        get() = 4
    override val initLvMinSpd: Int
        get() = 4
    override val maxLvMinHp: Int
        get() = 1313
    override val maxLvMinAtk: Int
        get() = 284
    override val maxLvMinDef: Int
        get() = 155
    override val maxLvMinSpd: Int
        get() = 130
    override val minAllGrowth: Double
        get() = 4.005
    override val maxAllGrowth: Double
        get() = 4.712
}