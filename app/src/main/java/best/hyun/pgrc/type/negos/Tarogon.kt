package best.hyun.pgrc.type.negos

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Tarogon : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_tarogon)
    override val type: PET_TYPE
        get() = PET_TYPE.NEGOS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_tarogon)
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
        get() = 44
    override val initLvMaxAtk: Int
        get() = 10
    override val initLvMaxDef: Int
        get() = 8
    override val initLvMaxSpd: Int
        get() = 4
    override val maxLvMaxHp: Int
        get() = 1454
    override val maxLvMaxAtk: Int
        get() = 331
    override val maxLvMaxDef: Int
        get() = 264
    override val maxLvMaxSpd: Int
        get() = 154
    override val initLvMinHp: Int
        get() = 34
    override val initLvMinAtk: Int
        get() = 8
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 3
    override val maxLvMinHp: Int
        get() = 1246
    override val maxLvMinAtk: Int
        get() = 293
    override val maxLvMinDef: Int
        get() = 226
    override val maxLvMinSpd: Int
        get() = 122
    override val minAllGrowth: Double
        get() = 4.532
    override val maxAllGrowth: Double
        get() = 5.239
}