package best.hyun.pgrc.type.ktarkas

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Kukas : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_kukas)
    override val type: PET_TYPE
        get() = PET_TYPE.KATARKAS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_kukas)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 49
    override val initLvMaxAtk: Int
        get() = 10
    override val initLvMaxDef: Int
        get() = 11
    override val initLvMaxSpd: Int
        get() = 3
    override val maxLvMaxHp: Int
        get() = 1465
    override val maxLvMaxAtk: Int
        get() = 311
    override val maxLvMaxDef: Int
        get() = 348
    override val maxLvMaxSpd: Int
        get() = 99
    override val initLvMinHp: Int
        get() = 38
    override val initLvMinAtk: Int
        get() = 8
    override val initLvMinDef: Int
        get() = 9
    override val initLvMinSpd: Int
        get() = 1
    override val maxLvMinHp: Int
        get() = 1256
    override val maxLvMinAtk: Int
        get() = 273
    override val maxLvMinDef: Int
        get() = 310
    override val maxLvMinSpd: Int
        get() = 68
    override val minAllGrowth: Double
        get() = 4.584
    override val maxAllGrowth: Double
        get() = 5.291
}