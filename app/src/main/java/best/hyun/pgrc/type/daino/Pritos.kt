package best.hyun.pgrc.type.daino

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Pritos : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_pritos)
    override val type: PET_TYPE
        get() = PET_TYPE.DAINO
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_pritos)
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
        get() = 71
    override val initLvMaxAtk: Int
        get() = 12
    override val initLvMaxDef: Int
        get() = 11
    override val initLvMaxSpd: Int
        get() = 4
    override val maxLvMaxHp: Int
        get() = 1705
    override val maxLvMaxAtk: Int
        get() = 293
    override val maxLvMaxDef: Int
        get() = 275
    override val maxLvMaxSpd: Int
        get() = 100
    override val initLvMinHp: Int
        get() = 58
    override val initLvMinAtk: Int
        get() = 9
    override val initLvMinDef: Int
        get() = 9
    override val initLvMinSpd: Int
        get() = 2
    override val maxLvMinHp: Int
        get() = 1494
    override val maxLvMinAtk: Int
        get() = 255
    override val maxLvMinDef: Int
        get() = 236
    override val maxLvMinSpd: Int
        get() = 69
    override val minAllGrowth: Double
        get() = 3.914
    override val maxAllGrowth: Double
        get() = 4.621
}