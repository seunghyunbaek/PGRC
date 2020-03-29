package best.hyun.pgrc.type.kukuru

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Laski : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_laski)
    override val type: PET_TYPE
        get() = PET_TYPE.KUKURU
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_laski)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 90
    override val subElementalValue: Int
        get() = 10
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 55
    override val initLvMaxAtk: Int
        get() = 13
    override val initLvMaxDef: Int
        get() = 7
    override val initLvMaxSpd: Int
        get() = 9
    override val maxLvMaxHp: Int
        get() = 1465
    override val maxLvMaxAtk: Int
        get() = 350
    override val maxLvMaxDef: Int
        get() = 189
    override val maxLvMaxSpd: Int
        get() = 244
    override val initLvMinHp: Int
        get() = 43
    override val initLvMinAtk: Int
        get() = 11
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 7
    override val maxLvMinHp: Int
        get() = 1255
    override val maxLvMinAtk: Int
        get() = 312
    override val maxLvMinDef: Int
        get() = 151
    override val maxLvMinSpd: Int
        get() = 212
    override val minAllGrowth: Double
        get() = 4.731
    override val maxAllGrowth: Double
        get() = 5.438
}