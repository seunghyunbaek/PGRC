package best.hyun.pgrc.type.mui

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Lubos : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_lubos)
    override val type: PET_TYPE
        get() = PET_TYPE.MUI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_lubos)
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
        get() = 61
    override val initLvMaxAtk: Int
        get() = 12
    override val initLvMaxDef: Int
        get() = 11
    override val initLvMaxSpd: Int
        get() = 5
    override val maxLvMaxHp: Int
        get() = 1556
    override val maxLvMaxAtk: Int
        get() = 324
    override val maxLvMaxDef: Int
        get() = 280
    override val maxLvMaxSpd: Int
        get() = 134
    override val initLvMinHp: Int
        get() = 48
    override val initLvMinAtk: Int
        get() = 10
    override val initLvMinDef: Int
        get() = 8
    override val initLvMinSpd: Int
        get() = 3
    override val maxLvMinHp: Int
        get() = 1346
    override val maxLvMinAtk: Int
        get() = 285
    override val maxLvMinDef: Int
        get() = 242
    override val maxLvMinSpd: Int
        get() = 103
    override val minAllGrowth: Double
        get() = 4.413
    override val maxAllGrowth: Double
        get() = 5.120
}