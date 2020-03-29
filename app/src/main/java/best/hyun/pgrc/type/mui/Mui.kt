package best.hyun.pgrc.type.mui

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Mui : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_mui)
    override val type: PET_TYPE
        get() = PET_TYPE.MUI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_mui)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
    override val subElemental: ELEMENTAL?
        get() = null
    override val mainElementalValue: Int
        get() = 100
    override val subElementalValue: Int
        get() = 0
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 50
    override val initLvMaxAtk: Int
        get() = 9
    override val initLvMaxDef: Int
        get() = 7
    override val initLvMaxSpd: Int
        get() = 3
    override val maxLvMaxHp: Int
        get() = 1651
    override val maxLvMaxAtk: Int
        get() = 320
    override val maxLvMaxDef: Int
        get() = 240
    override val maxLvMaxSpd: Int
        get() = 120
    override val initLvMinHp: Int
        get() = 40
    override val initLvMinAtk: Int
        get() = 8
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 2
    override val maxLvMinHp: Int
        get() = 1443
    override val maxLvMinAtk: Int
        get() = 282
    override val maxLvMinDef: Int
        get() = 202
    override val maxLvMinSpd: Int
        get() = 88
    override val minAllGrowth: Double
        get() = 4.052
    override val maxAllGrowth: Double
        get() = 4.759
}