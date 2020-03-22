package best.hyun.pgrc.type.ogaros

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber


class Golos : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_golos)
    override val type: PET_TYPE
        get() = PET_TYPE.OGAROS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_golos)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 50
    override val subElementalValue: Int
        get() = 50
    override val initLv: Int
        get() = 1
    override val initLvMaxHp: Int
        get() = 60
    override val initLvMaxAtk: Int
        get() = 13
    override val initLvMaxDef: Int
        get() = 11
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1416
    override val maxLvMaxAtk: Int
        get() = 320
    override val maxLvMaxDef: Int
        get() = 258
    override val maxLvMaxSpd: Int
        get() = 176
    override val initLvMinHp: Int
        get() = 46
    override val initLvMinAtk: Int
        get() = 11
    override val initLvMinDef: Int
        get() = 8
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1205
    override val maxLvMinAtk: Int
        get() = 282
    override val maxLvMinDef: Int
        get() = 220
    override val maxLvMinSpd: Int
        get() = 144
    override val minAllGrowth: Double
        get() = 4.513
    override val maxAllGrowth: Double
        get() = 5.220
}