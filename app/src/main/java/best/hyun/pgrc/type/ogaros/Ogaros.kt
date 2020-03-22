package best.hyun.pgrc.type.ogaros

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Ogaros : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_ogaros)
    override val type: PET_TYPE
        get() = PET_TYPE.OGAROS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_ogaros)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 60
    override val subElementalValue: Int
        get() = 40
    override val initLv: Int
        get() = 1
    override val initLvMaxHp: Int
        get() = 56
    override val initLvMaxAtk: Int
        get() = 11
    override val initLvMaxDef: Int
        get() = 10
    override val initLvMaxSpd: Int
        get() = 6
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1492
    override val maxLvMaxAtk: Int
        get() = 316
    override val maxLvMaxDef: Int
        get() = 279
    override val maxLvMaxSpd: Int
        get() = 162
    override val initLvMinHp: Int
        get() = 44
    override val initLvMinAtk: Int
        get() = 9
    override val initLvMinDef: Int
        get() = 8
    override val initLvMinSpd: Int
        get() = 4
    override val maxLvMinHp: Int
        get() = 1282
    override val maxLvMinAtk: Int
        get() = 277
    override val maxLvMinDef: Int
        get() = 240
    override val maxLvMinSpd: Int
        get() = 130
    override val minAllGrowth: Double
        get() = 4.541
    override val maxAllGrowth: Double
        get() = 5.248
}