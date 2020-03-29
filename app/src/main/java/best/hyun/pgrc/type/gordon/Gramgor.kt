package best.hyun.pgrc.type.gordon

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Gramgor : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_gramgor)
    override val type: PET_TYPE
        get() = PET_TYPE.GORDON
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_gramgor)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 65
    override val initLvMaxAtk: Int
        get() = 15
    override val initLvMaxDef: Int
        get() = 11
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLvMaxHp: Int
        get() = 1540
    override val maxLvMaxAtk: Int
        get() = 370
    override val maxLvMaxDef: Int
        get() = 258
    override val maxLvMaxSpd: Int
        get() = 176
    override val initLvMinHp: Int
        get() = 51
    override val initLvMinAtk: Int
        get() = 13
    override val initLvMinDef: Int
        get() = 8
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1329
    override val maxLvMinAtk: Int
        get() = 332
    override val maxLvMinDef: Int
        get() = 220
    override val maxLvMinSpd: Int
        get() = 144
    override val minAllGrowth: Double
        get() = 4.855
    override val maxAllGrowth: Double
        get() = 5.562
}