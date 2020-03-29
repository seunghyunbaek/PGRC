package best.hyun.pgrc.type.gordon

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Kinggor : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_kinggor)
    override val type: PET_TYPE
        get() = PET_TYPE.GORDON
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_kinggor)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.EARTH
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 64
    override val initLvMaxAtk: Int
        get() = 14
    override val initLvMaxDef: Int
        get() = 10
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLvMaxHp: Int
        get() = 1579
    override val maxLvMaxAtk: Int
        get() = 369
    override val maxLvMaxDef: Int
        get() = 246
    override val maxLvMaxSpd: Int
        get() = 176
    override val initLvMinHp: Int
        get() = 51
    override val initLvMinAtk: Int
        get() = 12
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1368
    override val maxLvMinAtk: Int
        get() = 331
    override val maxLvMinDef: Int
        get() = 207
    override val maxLvMinSpd: Int
        get() = 144
    override val minAllGrowth: Double
        get() = 4.769
    override val maxAllGrowth: Double
        get() = 5.476
}