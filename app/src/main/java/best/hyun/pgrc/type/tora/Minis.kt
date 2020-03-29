package best.hyun.pgrc.type.tora

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Minis : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_minis)
    override val type: PET_TYPE
        get() = PET_TYPE.TORA
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_minis)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.FIRE
    override val mainElementalValue: Int
        get() = 60
    override val subElementalValue: Int
        get() = 40
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 63
    override val initLvMaxAtk: Int
        get() = 15
    override val initLvMaxDef: Int
        get() = 8
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLvMaxHp: Int
        get() = 1499
    override val maxLvMaxAtk: Int
        get() = 365
    override val maxLvMaxDef: Int
        get() = 198
    override val maxLvMaxSpd: Int
        get() = 197
    override val initLvMinHp: Int
        get() = 49
    override val initLvMinAtk: Int
        get() = 12
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1288
    override val maxLvMinAtk: Int
        get() = 326
    override val maxLvMinDef: Int
        get() = 159
    override val maxLvMinSpd: Int
        get() = 165
    override val minAllGrowth: Double
        get() = 4.541
    override val maxAllGrowth: Double
        get() = 5.248
}