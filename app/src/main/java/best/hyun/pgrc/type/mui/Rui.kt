package best.hyun.pgrc.type.mui

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Rui : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_rui)
    override val type: PET_TYPE
        get() = PET_TYPE.MUI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_rui)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
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
        get() = 53
    override val initLvMaxAtk: Int
        get() = 11
    override val initLvMaxDef: Int
        get() = 8
    override val initLvMaxSpd: Int
        get() = 4
    override val maxLvMaxHp: Int
        get() = 1602
    override val maxLvMaxAtk: Int
        get() = 334
    override val maxLvMaxDef: Int
        get() = 254
    override val maxLvMaxSpd: Int
        get() = 120
    override val initLvMinHp: Int
        get() = 42
    override val initLvMinAtk: Int
        get() = 9
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 2
    override val maxLvMinHp: Int
        get() = 1393
    override val maxLvMinAtk: Int
        get() = 296
    override val maxLvMinDef: Int
        get() = 216
    override val maxLvMinSpd: Int
        get() = 89
    override val minAllGrowth: Double
        get() = 4.233
    override val maxAllGrowth: Double
        get() = 4.940
}