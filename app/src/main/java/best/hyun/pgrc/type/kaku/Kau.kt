package best.hyun.pgrc.type.kaku

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Kau : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_kau)
    override val type: PET_TYPE
        get() = PET_TYPE.KAKU
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_kau)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 70
    override val subElementalValue: Int
        get() = 30
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 34
    override val initLvMaxAtk: Int
        get() = 8
    override val initLvMaxDef: Int
        get() = 6
    override val initLvMaxSpd: Int
        get() = 5
    override val maxLvMaxHp: Int
        get() = 1326
    override val maxLvMaxAtk: Int
        get() = 327
    override val maxLvMaxDef: Int
        get() = 248
    override val maxLvMaxSpd: Int
        get() = 207
    override val initLvMinHp: Int
        get() = 26
    override val initLvMinAtk: Int
        get() = 7
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 4
    override val maxLvMinHp: Int
        get() = 1118
    override val maxLvMinAtk: Int
        get() = 289
    override val maxLvMinDef: Int
        get() = 210
    override val maxLvMinSpd: Int
        get() = 176
    override val minAllGrowth: Double
        get() = 4.788
    override val maxAllGrowth: Double
        get() = 5.495
}