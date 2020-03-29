package best.hyun.pgrc.type.bubi

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Buibee : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_buibee)
    override val type: PET_TYPE
        get() = PET_TYPE.BUBI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_buibee)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 60
    override val subElementalValue: Int
        get() = 40
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 36
    override val initLvMaxAtk: Int
        get() = 6
    override val initLvMaxDef: Int
        get() = 4
    override val initLvMaxSpd: Int
        get() = 3
    override val maxLvMaxHp: Int
        get() = 1608
    override val maxLvMaxAtk: Int
        get() = 273
    override val maxLvMaxDef: Int
        get() = 200
    override val maxLvMaxSpd: Int
        get() = 165
    override val initLvMinHp: Int
        get() = 28
    override val initLvMinAtk: Int
        get() = 4
    override val initLvMinDef: Int
        get() = 3
    override val initLvMinSpd: Int
        get() = 2
    override val maxLvMinHp: Int
        get() = 1385
    override val maxLvMinAtk: Int
        get() = 232
    override val maxLvMinDef: Int
        get() = 160
    override val maxLvMinSpd: Int
        get() = 132
    override val minAllGrowth: Double
        get() = 3.741
    override val maxAllGrowth: Double
        get() = 4.504
}